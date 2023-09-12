package com.mahindra.practice.practices

fun main() {
    print("Enter a string: ")
    val text = readLine() ?: ""/* It reads a line of input from the user, or assigns an empty string to text if an error occurs or no input is provided. It’s a common way to safely read input in Kotlin.*/
    /*
     It reads a line of input from the user,
     or assigns an empty string to text if an error occurs or no input is provided.
      It’s a common way to safely read input in Kotlin.
     */
    
    val charCount = mutableMapOf<Char, Int>()// map provides the pair of objects of key and value
    for (char in text) {
        val count = charCount[char]
        if (count == null) {// to count the spaces
            charCount[char] = 1
        } else {//to count the characters presents
            charCount[char] = count + 1
        }
    }
    for ((char, count) in charCount) {// for printing the counted characters
        println("'$char' appears $count times")
    }
}