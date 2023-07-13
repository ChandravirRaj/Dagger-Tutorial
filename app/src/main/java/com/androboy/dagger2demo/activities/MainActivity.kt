package com.androboy.dagger2demo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androboy.dagger2demo.R
import com.androboy.dagger2demo.component.DaggerStudentRegistrationComponent

/**
 * This is an example of Constructor Injection of Dagger2
 * */

/*Dagger is a fully static  compile time dependency injection

1- it check at compile time that Dagger can create the require objects or not
2- it is annotation based

1- Dagger will behaves like a system for us to create required objects
2-Dagger help us to inject these objects
3- Dagger will manage the life time of these objects
4-Dagger will us to write manageable code



Concept-

Consumer <—-  Connector  —--> Producer

Consumer  (@Inject)
Connector  (@Module @Provides @Binds)
Producer   (@Component)*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val emailRepository = EmailRepository()
//        val studentRepository = StudentRepository()
//        val studentRegistrationService = StudentRegistrationService(emailRepository,studentRepository)

        val component = DaggerStudentRegistrationComponent.builder().build()
//        val studentRegistrationService =component.studentRegistrationService()
        //  studentRegistrationService.registerUser("cvs@yopmail.com","123456")


        val emailRepository = component.emailRepository()
        val studentRepository = component.studentRepository()
        studentRepository.saveStudent("cvs@yopmail.com","123456")
        emailRepository.sendEmail("cvs@yopmail.com")
    }
}