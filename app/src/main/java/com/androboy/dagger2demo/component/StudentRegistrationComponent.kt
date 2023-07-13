package com.androboy.dagger2demo.component

import com.androboy.dagger2demo.repository.v1.EmailRepository
import com.androboy.dagger2demo.repository.v1.StudentRepository
import com.androboy.dagger2demo.service.StudentRegistrationService
import dagger.Component

@Component
interface StudentRegistrationComponent {
    fun studentRegistrationService(): StudentRegistrationService
    fun studentRepository() : StudentRepository
    fun emailRepository() : EmailRepository
}