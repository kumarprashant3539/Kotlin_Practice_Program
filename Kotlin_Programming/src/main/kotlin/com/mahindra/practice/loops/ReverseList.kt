package com.mahindra.practice.loops
/*
Reverse the list using indexes
 */
fun reverseList(list: List<Int>):List<Int>{
    val result= arrayListOf<Int>()
    for (i in 0..list.size-1){
        result.add(list.get(list.size-1-i))
    }
    return result
}
//******************************************************************
/*
Reversed the list using Built-in Function
 */
fun reverseListByBuiltIn(list: List<Int>):List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list.get(i))
    }
    return result
}

fun main() {
    val numbers= listOf(1,2,3,4,5,6,7,8,9)
    println("The given list is: $numbers")
    println()
    println("The reversed list getting by using Built-In function is: "+ reverseListByBuiltIn(numbers))
    println()
    println("The reversed list getting by using Index is: "+reverseList(numbers))
}