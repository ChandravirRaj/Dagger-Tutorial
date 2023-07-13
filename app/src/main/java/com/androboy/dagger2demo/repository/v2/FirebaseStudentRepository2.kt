package com.androboy.dagger2demo.repository

import android.util.Log
import com.androboy.dagger2demo.repository.v2.StudentRepository
import javax.inject.Inject

class FirebaseStudentRepository2 @Inject constructor() :StudentRepository{
    private val TAG: String = "StudentRepository"

    override fun save(email: String, password: String) {
        Log.d(TAG, "Student data have been saved successfully.... email : $email   password : $password  into Firebase" )
    }
}