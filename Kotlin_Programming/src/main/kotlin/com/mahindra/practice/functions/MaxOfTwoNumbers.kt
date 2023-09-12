package com.mahindra.practice.functions
/*
To return String
 */
fun maxOfTwoNumbers(a:Int,b:Int):String{
    when {
        a>b -> return "$a is greater"
        a==b -> return "$a and $b are equal"
        else -> return "$b is greater"
    }
}
/*
To return Int
 */
fun maxOfTwoNumbers(a:Int,b:Int,c:Int):Int{
    when {
        a>b && a>c -> return a
        b>a && b>c -> return b
        a==b && b==c -> return a
        else -> return c
    }
}

fun main() {
    println(maxOfTwoNumbers(10,15))
    println(maxOfTwoNumbers(10,10,20))
}