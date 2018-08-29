package com.example.eprifti1.kointtest

class MyPresenter(val repository : Repository){
    fun sayHello() = repository.giveHello()
}