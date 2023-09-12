package com.mahindra.practice.functions

import java.util.Date

fun printWithSpaces(text:String){
    for(char in text){
        print(char+" ")
    }
    println()
}
/*
Function with return type
 */
fun getCurrentDate():Date{
    return Date()
}


fun main() {
    printWithSpaces("I work for Mahindra!")
    println( getCurrentDate())
}