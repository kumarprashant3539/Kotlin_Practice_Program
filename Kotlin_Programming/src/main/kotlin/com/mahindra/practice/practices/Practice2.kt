package com.mahindra.practice.practices
import java.util.Scanner;
// Prashant Kumar
fun main() {

    val sc = Scanner(System.`in`)
    print("Enter your age: ")
    /* nextInt() method is used to take
    * next integer value and store in age variable*/
    val age = sc.nextInt()
    if(age < 18){
        println("You are not eligible for voting!!")
    }
    else{
        println("Congrats! You are eligible to vote in 2024 election.")
    }
}
