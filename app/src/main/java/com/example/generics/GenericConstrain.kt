package com.example.generics

//terkadang kita ingin membatasi data yang boleh digunakan di generic parameter type
//kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan-
//-secara otomatis, tipe data yang bisa digunakan adalah tipe yang sudah kita sebutkan atau class class turunannya
//secara default contraint type untuk generic parameter type adalah any, sehingga semua tipe data bisa digunakan

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Employee>(val employe : T)

fun main() {
    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
}