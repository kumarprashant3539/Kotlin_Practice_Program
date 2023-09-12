package com.mahindra.practice.loops

fun main() {
    outer@for (i in 1..10){ // we can name the loop by using the name and @symbol before the loop
        for (j in 1..10){
            if (i==j) {
                continue@outer// this will continue the outer loop
            }
            println("$i-$j")
        }
    }
}