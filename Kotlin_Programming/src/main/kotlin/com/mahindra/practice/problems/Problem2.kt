package com.mahindra.practice.problems
/**
 * @author Prashant Kumar
 *
 * Solution for the coding challenge-2

 */

fun main() {
    var sum = 0L
    for (i in 100..100000L){
        sum += i
    }
    println("the sum of all numbers from 100 to 100,000 is $sum" )
}