package com.androboy.dagger2demo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androboy.dagger2demo.DaggerDemoApp
import com.androboy.dagger2demo.R
import com.androboy.dagger2demo.component.DaggerStudentRegistrationComponent2
import com.androboy.dagger2demo.service.StudentRegistrationService
import com.androboy.dagger2demo.service.v2.NotificationService2
import com.androboy.dagger2demo.service.v2.StudentRegistrationService2
import javax.inject.Inject

/**
 * This is an example of Fields Injection of Dagger2
 * This for @Module @Provides and @Binds annotation
 * @Named annotation and Qualifier
 * */
class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var studentRegistrationService:StudentRegistrationService2

    @Inject
    lateinit var notificationService2: NotificationService2

    @Inject
    lateinit var notificationService3: NotificationService2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * here passing runtime value by module
         * */
//        val component2 = DaggerStudentRegistrationComponent2.builder()
//            .studentRegistrationModule(StudentRegistrationModule(5))
//            .build()
//        component2.injection(this)

        // that is how we are calling factory here
        // Activity level Singleton
//        val component2 = DaggerStudentRegistrationComponent2.factory().create(4)
//        component2.injection(this)

        // // Application level Singleton
        val component2 = (application as DaggerDemoApp).studentRegistrationComponent2
        component2.injection(this)


        studentRegistrationService.registerUser("cvs@yopmail.com","123456")
        notificationService2.sendEmail("cvs@yopmail.com")

        Log.d("MMMMMM", "onCreate:  notificationService2 : ${notificationService2.hashCode()}")
        Log.d("MMMMMM", "onCreate:  notificationService3 : ${notificationService3.hashCode()}")

    }
}