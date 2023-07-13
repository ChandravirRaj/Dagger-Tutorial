package com.androboy.dagger2demo.service.v2

import com.androboy.dagger2demo.qualifier.SQLQualifier
import com.androboy.dagger2demo.repository.v2.StudentRepository
import javax.inject.Inject

class StudentRegistrationService2 @Inject constructor(
    @SQLQualifier private val studentRepository: StudentRepository
) {

    fun registerUser(email:String,password:String){
        studentRepository.save(email,password)

    }
}