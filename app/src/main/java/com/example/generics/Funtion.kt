package com.example.generics

class Funtion (val nama : String = "Heri"){

    fun <T> sayHello (param : T){
        println("Hello $param, nama saya adalah $nama")


    }
}

fun main() {
    val funtion = Funtion("lukem")

    funtion.sayHello("hakim")
    funtion.sayHello<Int>(1)
}

