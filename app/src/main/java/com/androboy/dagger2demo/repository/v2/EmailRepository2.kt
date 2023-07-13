package com.androboy.dagger2demo.repository

import android.util.Log
import com.androboy.dagger2demo.repository.v2.NotificationRepository
import javax.inject.Inject

class EmailRepository2 @Inject constructor() :NotificationRepository{
    val TAG :String = "EmailService"

    override fun send(textEmail: String) {
        Log.d(TAG, "Email has been sent to Student... on $textEmail")
    }
}