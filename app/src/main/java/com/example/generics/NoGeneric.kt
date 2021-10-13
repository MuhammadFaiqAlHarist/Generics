package com.example.generics

class Building1(val data : Any)

fun main() {
    val dataString = Building1("pertamina")
    val valueString : String = dataString.data as String

    val dataInt = Building1(10)
    val valueInt : Int = dataInt.data as Int
}