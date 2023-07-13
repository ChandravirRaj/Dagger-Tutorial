package com.androboy.dagger2demo.repository.v2

import android.util.Log
import com.androboy.dagger2demo.repository.v2.StudentRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SQLStudentRepository2(private val count:Int) : StudentRepository{
    private val TAG: String = "StudentRepository"

    override fun save(email: String, password: String) {
        Log.d(TAG, "Student data have been saved successfully.... email : $email   password : $password into SQL DB count : $count")
    }
}