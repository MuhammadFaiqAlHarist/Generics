package com.example.generics

/*Covariant artinya kita melakukan subtitusi subtype(child) dengan supertype(parent)tidak
semua jenis class generic yag mendukung covariant hanya class generic yang menggunakan generic
parameter type sebagai  return type function unutk kata kuncinya kita akan mengguankan out*/
class Covariant<out T> (val Data : T){

    fun data() : T{
        return data()
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("Faiq")
    val data2 : Covariant<Any> = data1
}