package com.mahindra.practice.OOPs

/**
 * @author Prashant Kumar
 * This code is about the inheritance.
 * For inheritance of parent class we have to make the parent class as open,
 * and we have  to declare the parameters of parent class as open too.
 * If the child class is inheriting the parent class then the parameter of parent class which are
 * passed to child class are tyo written with override keyword.
 * In the inheritance we can create the object of the parent class too.
 */

open class Human(open val name: String,open val age:Int){
    fun greet(name: String){
        println("Hello $name")
    }
    fun getYearOfBirth()=2023-age
}
class Students(override val name: String,override val age: Int):Human(name,age){
    fun getResult(){
        println("Hii I have got my result! and I have passed Graduation first class with distinction")
    }
}
class Employee(override val name: String,override val age: Int):Human(name,age){
    fun getPaymemt(){
        println("I have received the payment!")
    }
}
fun main() {
    val student=Students("Prashant", age = 22)
    student.greet(name ="Shivam")
    println( student.getYearOfBirth())
    student.getResult()
    val emp = Employee(name = "Mohit", age = 50)
    emp.greet(name = "Mohan")
    emp.getPaymemt()
}