package com.example.generics

/*secara default saat kita membuat parameter type,sifat*/
/*parameter tersebut adalah invariant*/
/*invariant = tidak boleh subtitusi subtype(child) atau supertype(parent)*/

class Invariant <T> (val data : T)

fun main() {
    val data1 : Invariant<String> = Invariant("faiq")
    val data2 : Invariant<Any>
}

