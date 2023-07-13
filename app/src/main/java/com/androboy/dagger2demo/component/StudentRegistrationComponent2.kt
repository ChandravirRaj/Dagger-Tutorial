package com.androboy.dagger2demo.component

import com.androboy.dagger2demo.activities.MainActivity2
import com.androboy.dagger2demo.module.NotificationModule
import com.androboy.dagger2demo.module.StudentRegistrationModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NotificationModule::class,StudentRegistrationModule::class])
interface StudentRegistrationComponent2 {

    fun injection(mainActivity2: MainActivity2)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance count:Int): StudentRegistrationComponent2
    }
}