package com.mahindra.practice.practices

fun main() {
    // To create the array
    val array = arrayOf("Prashant","Kumar","Shivam","Rampravesh")
    //functions for array
    println( array.size)// To print the size of array
    println(array[1])
    println(array.contains("Shivam"))

    val states= arrayOf("Assam","Bihar","Chhatisgarh")
    val unionTer = arrayOf("Pandicherry","Delhi","Laddakh")
    val india = states+unionTer
    println(india.isEmpty())
    println(india.joinToString())//joinToString() is used to print the array in the console
    /*
     * If we are going to print the arrauy directly to consile using println(),
         it will give the address os array stored.
     * If we want to print the array in the console then we can use arrayname.joinToString()
     */


    val array1 = arrayOf("a", "b", "c")
    val array2 = arrayOf("d", "e", "f")

    val result = array1 + array2

    println("Concatenated array: ${result.joinToString()}")
}