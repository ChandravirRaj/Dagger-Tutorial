package com.androboy.dagger2demo.repository.v2

import android.util.Log

class MessageRepository2 :NotificationRepository{
    val TAG :String = "MessageRepository2"

    override fun send(textEmail: String) {
        Log.d(TAG, "Message has been sent to Student... on $textEmail")
    }
}