package com.mahindra.practice.OOPs

/**
 * @author Prashant Kumar
 * This code is about the abstract
 * For abstraction of class we have to use the abstract keyword
 * In the abstraction we can't create the object of the parent class.
 * abstract classes are implicitly open so no need to declare them as open
 */

abstract class Human1(open val name: String,open val age:Int){
    abstract fun greet()
    fun getYearOfBirth()=2023-age
}
class Students1(override val name: String,override val age: Int):Human1(name,age){
    override fun greet(){
        println("Hii there I'm a student of RLJIT ")
    }

    fun getResult(){
        println("Hii I have got my result! and I have passed Graduation first class with distinction")
    }
}
class Employee1(override val name: String,override val age: Int):Human1(name,age){
    fun getPaymemt(){
        println("I have received the payment!")
    }
    override fun greet(){
        println("Hello I'm an employee of Mahindra")
    }
}
fun main() {
    val student= Students1("Prashant", age = 22)
    student.greet()
    println( "My year of birth is: "+student.getYearOfBirth())
    student.getResult()
    println("************************ This is for the employee *************************")
    val emp = Employee1(name = "Mohit", age = 50)
    emp.greet()
    emp.getPaymemt()

}