package com.androboy.dagger2demo.module

import com.androboy.dagger2demo.qualifier.FirebaseQualifier
import com.androboy.dagger2demo.qualifier.SQLQualifier
import com.androboy.dagger2demo.repository.FirebaseStudentRepository2
import com.androboy.dagger2demo.repository.v2.SQLStudentRepository2
import com.androboy.dagger2demo.repository.v2.StudentRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Runtime values can be pass through module constructor
 * class StudentRegistrationModule(private val count:Int)
 * There is also way using Component Factory
 *
 * Let's create factory
 * */
@Module
class StudentRegistrationModule() {

    @SQLQualifier
    @Singleton
    @Provides
    fun getSQLRepository(count :Int): StudentRepository {
        return SQLStudentRepository2(count)// SQLStudentRepository2 is without constructor injection So we are making object like this
    }


    /**
     *  This way is used to create object when required class has construction injection . like in our case
     *   FirebaseStudentRepository2 has construction injection
     * */

    @FirebaseQualifier
    @Provides
    fun getFirebaseRepository(firebaseStudentRepository2: FirebaseStudentRepository2): StudentRepository {
        return firebaseStudentRepository2
    }


    /**
     * Above we are using two qualifiers. Tha Qualifiers are used to tell connector which type object is required by
     * consumer
     *
     * This module is provide two objects and Dagger will confuse , which object is required by consumer.
     * So This problem can be solve by Qualifiers only
     * */

}


/**
 * here we are using binds annotation
 * The method which is providing object should be abstract and class also. You can check below implementation
 * */
/*@Module
abstract class StudentRegistrationModule {

//    @Provides
//    fun getSQLRepository():StudentRepository{
//        return SQLStudentRepository2()// SQLStudentRepository2 is without constructor injection So we are making object like this
//    }



    */
/**
 *  This way is used to create object when required class has construction injection . like in our case
 *   FirebaseStudentRepository2 has construction injection
 * *//*
    @Binds
    abstract fun getFirebaseRepository(firebaseStudentRepository2: FirebaseStudentRepository2): StudentRepository

}*/
