package com.androboy.dagger2demo.repository.v1

import android.util.Log
import javax.inject.Inject

class StudentRepository @Inject constructor(){
    private val TAG: String = "StudentRepository"

    fun saveStudent(email:String, password:String){
        Log.d(TAG, "Student data have been saved successfully.... email : $email   password : $password")
    }
}