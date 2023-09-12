package com.mahindra.practice.OOPs

/**
 * @author Prashant Kumar
 * We can inherit the parent class to multiple child class.
 * We want to stop the inheritance of parent class (functions/methods) ,
 *  then we can use the final keyword .After that child class would not be able to
 *  inherit the parent class functions/methods.
 * We can use super keyword to implement the parent function to child class.
 * If a child class inherits the interface and parent class ,
 *  on that time if we want to access the method by using super keyword then,
 *  on that time we have to specify the super type(like: super<Learnable> or super<Course>).
 */

abstract class Course(val topic:String,val price:Float){
    open fun learn(){
        println("I'm learning the $topic course")
    }
}

interface Learnable{
    fun learn(){
        println("I'm learning...")
    }
}

open class KotlinCourse():Course(topic = "Kotlin", price = 999.99f),Learnable{
    override fun learn() {
        super<Learnable>.learn()
        println("I'm the one of the first to learn Kotlin")
    }
}
fun main() {
    val course = KotlinCourse()
    course.learn()

}