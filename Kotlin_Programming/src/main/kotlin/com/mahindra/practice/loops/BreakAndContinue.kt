package com.mahindra.practice.loops

fun main() {
    var counter = 1
    while (counter <= 10) {
        if (counter == 2) {
            println("The counter is jumped from counter-$counter and moved to next iteration")
            counter++
            continue    //used to jump from the given counter and move to next iteration
        }
        println("Counter: $counter")
        if (counter == 5) {
            println("Breaking the loop")
            break   //Used to break the loop and come out of loop
        }
        counter++
    }
    //**************************************************************
    println("\n\n\n\n")
    val list = arrayListOf("Python","Java","Kotlin","C","C++")
    for (element in list){
        if (element.contains('o')){
            println("I Love this languages $element")
            continue
        }
    }
}