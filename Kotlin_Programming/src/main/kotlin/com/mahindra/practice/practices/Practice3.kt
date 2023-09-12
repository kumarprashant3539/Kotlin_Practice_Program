package com.mahindra.practice.practices

import java.util.Scanner
fun main(){
    val sc=Scanner(System.`in`);
    println("Enter the time(format-24 hr): ")
    val time = sc.nextInt();
    when(time){
        in 1..6 -> println("Good Night It's time for sleep!")
        in 7..8-> println("Hii It's time to be fresh ")
        in 9..10-> println("It's time for breakfast")
        in 11..12-> println("Hii champ you can study or you can take rest")
        in 13..15-> println("Hii Champ It's time for lunch")
        in 16..17 -> println("It's time for take rest")
        in 18..20-> println("Its time for study")
        in 21..23-> println("It's time for dinner")
        24-> println("It's mid-night so you should go to sleep")
       else-> println("Give the valid time")

    }

}


