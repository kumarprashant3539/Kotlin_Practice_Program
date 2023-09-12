package com.mahindra.practice.practices

import java.util.*

fun main(){
    val x=20
    when(x){

        5->println("X is 5")
        in 1..10->println("x is in 1-10")
        3*12-> println("X is in 3*12")
        !in 1..9-> println("x is not in 1-9")
        in 10..20-> println("X is in 10-20")

    }
}