package com.androboy.dagger2demo.repository.v1

import android.util.Log
import javax.inject.Inject

class EmailRepository @Inject constructor(){
    val TAG :String = "EmailService"

    fun sendEmail(email:String){
        Log.d(TAG, "Email has been sent to Student... on $email")
    }
}