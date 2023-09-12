package com.mahindra.practice.loops

fun main() {
    // TO print the elements of a given list
    val element= listOf("Java","Python","Kotlin")
    for (i in element){
        println(i)
    }
    // to print the elements with the index and value
    for ((index,value ) in element.withIndex() ){
        println("Element at $index is $value" )
    }
    // to print the sum of given numbers in a particular range
    var sum:Float =0.0f
    for (i in 1..10){
         sum=sum+i
    }
    println("The sum of given range is $sum ")
}