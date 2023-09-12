package com.mahindra.practice.OOPs

class Person{
    var name:String="Prashant"
    var age: Int=22
    fun greeting(name:String){
        println("Hello $name")
    }
}

fun main() {
    val person=Person()
    println(person.name)
    println(person.age)
    person.name="Prashant Kumar"
    person.age=25
    println(person.name)
    println(person.age)
    person.greeting("Prashant Kumar!")
}