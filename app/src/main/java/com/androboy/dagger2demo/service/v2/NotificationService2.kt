package com.androboy.dagger2demo.service.v2

import com.androboy.dagger2demo.repository.v2.NotificationRepository
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class NotificationService2 @Inject constructor(
    @Named("email") private val emailService: NotificationRepository,
) {

    fun sendEmail(email:String){
        emailService.send(email)
    }
}

/**
 *  Here we have used Singleton annotation. This annotation is depends on Scope.
 *  Scopes are tow Types
 *  1- Activity Scope-  if you are making component Singleton on basis activity,
 *  it will be singleton only for activity, if activity recreate it will give new new Instance
 *
 *  2- Application- if you are making component Singleton on basis activity
 *  it will be singleton only for overall application, if activity recreate it will not create new
 *  instance of class on which we applied Singleton annotation
 * */