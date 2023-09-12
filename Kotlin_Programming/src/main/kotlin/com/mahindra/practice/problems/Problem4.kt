package com.mahindra.practice.problems
/**
 * @author Prashant Kumar
 *
 * Solution for the coding challenge-4
 * Defines a Book class with the specified properties and methods.
 */


class Book(val title: String, val author: String, val publicationYear: Int) {
    var borrowed: Boolean = false

    fun borrow() {
        if (!borrowed) {
            borrowed = true
            println()
        } else {
            println("$title by $author is already borrowed.")
        }
    }

    fun returnBook() {
        if (borrowed) {
            borrowed = false
            println()
        } else {
            println("$title by $author is not currently borrowed. so it can't be returned")
        }
    }

    fun displayInfo() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publicationYear")
        if (borrowed) {
            println("Status: Borrowed")
        } else {
            println("Status: Available")
        }
    }
}

fun main() {
    val book1=Book("DSA","Prashant",2020)

    book1.displayInfo()
    book1.borrow()
    book1.displayInfo()
    book1.returnBook()


}





