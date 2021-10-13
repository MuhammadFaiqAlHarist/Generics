package com.example.generics

class Building2<T, U>(val data : T, val  secondData : U){
    fun printData(){
        return println("data nya $data $secondData")
    }
}

fun main() {

    val dataString = Building2<String, Int>("pertamina",4)

    val dataInt = Building2(10,"PlN")

    val dataBoolean =Building2(true, 4.2)

    dataString.printData()
    dataInt.printData()
    dataBoolean.printData()
}