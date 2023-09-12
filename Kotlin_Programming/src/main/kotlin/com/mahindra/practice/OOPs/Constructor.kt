package com.mahindra.practice.OOPs

class Student(val name:String,var age:Int){
    fun getYearOfBirth()=2023-age

    fun greet()="Hello $name"

    fun greet(name: String){
        println("Hello $name Kumar!")
    }

}

fun main() {
    var stud=Student("Prashant",22)
    println(stud.getYearOfBirth())
    println(stud.greet())
    println(stud.greet("Prashant"))
}