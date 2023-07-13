package com.androboy.dagger2demo.repository.v2


interface StudentRepository {
    fun save(email:String, password:String)
}