package com.androboy.dagger2demo

import android.app.Application
import com.androboy.dagger2demo.component.DaggerStudentRegistrationComponent2
import com.androboy.dagger2demo.component.StudentRegistrationComponent2

class DaggerDemoApp : Application() {
    lateinit var studentRegistrationComponent2: StudentRegistrationComponent2


    override fun onCreate() {
        super.onCreate()
        studentRegistrationComponent2 = DaggerStudentRegistrationComponent2.factory().create(3)
    }
}