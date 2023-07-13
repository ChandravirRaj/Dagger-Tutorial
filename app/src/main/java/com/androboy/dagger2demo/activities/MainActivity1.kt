package com.androboy.dagger2demo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androboy.dagger2demo.R
import com.androboy.dagger2demo.component.DaggerStudentRegistrationComponent1
import com.androboy.dagger2demo.service.StudentRegistrationService
import javax.inject.Inject

/**
 * This is an example of Fields Injection of Dagger2
 * */
class MainActivity1 : AppCompatActivity() {

    @Inject
    lateinit var studentRegistrationService:StudentRegistrationService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerStudentRegistrationComponent1.builder().build()
        component.injection(this)

        studentRegistrationService.registerUser("cvs@yopmail.com","123456")

    }
}