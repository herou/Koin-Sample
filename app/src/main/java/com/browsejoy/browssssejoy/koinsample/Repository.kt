package com.example.eprifti1.kointtest

interface Repository {
    fun giveHello(): String
}

class MyRepository() : Repository {
    override fun giveHello() = "Hello Eljo Prifti"
}