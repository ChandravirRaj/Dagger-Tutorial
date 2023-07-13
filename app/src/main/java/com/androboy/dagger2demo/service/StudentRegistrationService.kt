package com.androboy.dagger2demo.service

import com.androboy.dagger2demo.repository.v1.EmailRepository
import com.androboy.dagger2demo.repository.v1.StudentRepository
import javax.inject.Inject
import javax.inject.Named

class StudentRegistrationService @Inject constructor(
    /**
     * Unite test is not possible here
     * braking low of Single responsibility
     * Life time of Objects depends on this class(EmailRepository(),StudentRepository())
     * Extensible
     * */

    // to remove above problem , move fields in to constructor

    private val emailService: EmailRepository,
    private val studentRepository: StudentRepository
) {

    fun registerUser(email:String,password:String){
        studentRepository.saveStudent(email,password)

    }

    fun sendEmail(email:String){
        emailService.sendEmail(email)
    }
}