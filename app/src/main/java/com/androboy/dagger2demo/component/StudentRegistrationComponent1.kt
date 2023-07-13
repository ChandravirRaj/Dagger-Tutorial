package com.androboy.dagger2demo.component

import com.androboy.dagger2demo.activities.MainActivity1
import dagger.Component

@Component
interface StudentRegistrationComponent1 {
//    fun studentRegistrationService(): StudentRegistrationService
//    fun studentRepository() :StudentRepository
//    fun emailRepository() :EmailRepository

    /**
     * create a method and pass consumer
     * mainActivity1: MainActivity1 is a consumer
     * */
    fun injection(mainActivity1: MainActivity1)
}