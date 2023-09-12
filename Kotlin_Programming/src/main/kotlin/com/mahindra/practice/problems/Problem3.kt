package com.mahindra.practice.problems
/**
 * @author Prashant Kumar
 *
 * Solution for the coding challenge-3

 */

fun main() {
    val books = arrayListOf("Java","Python","DSA","System Design","Software Engineering")
    for (i in books){
        if (i.contains('e') || i.contains('E')){
            for (character in i) {
                println(character)
            }
        }
        println()
    }
}