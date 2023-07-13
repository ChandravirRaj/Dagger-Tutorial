package com.androboy.dagger2demo.module

import com.androboy.dagger2demo.repository.EmailRepository2
import com.androboy.dagger2demo.repository.v2.MessageRepository2
import com.androboy.dagger2demo.repository.v2.NotificationRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule {

    @Named("message")
    @Singleton
    @Provides
    fun getMessageRepository():NotificationRepository{
        return MessageRepository2()
    }

    @Named("email")
    @Singleton
    @Provides
    fun getEmailRepository(emailRepository2: EmailRepository2):NotificationRepository{
        return emailRepository2
    }
}