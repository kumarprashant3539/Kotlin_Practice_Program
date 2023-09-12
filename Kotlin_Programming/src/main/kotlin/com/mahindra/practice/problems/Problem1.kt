package com.mahindra.practice.problems

/**
 * @author Prashant Kumar
 *
 * Solution for the coding challenge-1

 */
import java.util.Random
fun main(){
    val random = Random().nextInt(50) + 1
    when(random){
        in 1..10-> println(" The random number is in between 1-10")
        in 11..20-> println(" The random number is in between 11-20")
        in 21..30-> println(" The random number is in between 21-30")
        in 31..40-> println(" The random number is in between 31-40")
        in 41..50-> println(" The random number is in between 41-50")

    }

}