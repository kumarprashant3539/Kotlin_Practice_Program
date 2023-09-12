package com.mahindra.practice.problems

// Define the Lendable interface
interface Lendable {
    fun borrow()
}

// Define the abstract class InventoryItem implementing Lendable
abstract class InventoryItem(
    val title: String,
    val genre: String,
    val publicationYear: Int
) : Lendable

// Create the Book class which inherits from InventoryItem
class Book1(
    title: String,
    genre: String,
    publicationYear: Int,
    val author: String
) : InventoryItem(title, genre, publicationYear) {
    override fun borrow() {
        println("Borrowing a book: $title by $author")
    }
}

// Create the DVD class which inherits from InventoryItem
class DVD(
    title: String,
    genre: String,
    publicationYear: Int,
    val lengthInSeconds: Int
) : InventoryItem(title, genre, publicationYear) {
    override fun borrow() {
        println("Borrowing a DVD: $title (${lengthInSeconds} seconds)")
    }
}

fun main() {
    val book = Book1("The Great Gatsby", "Fiction", 1925, "F. Scott Fitzgerald")
    val dvd = DVD("Inception", "Science Fiction", 2010, 148)

    book.borrow()
    dvd.borrow()
}
