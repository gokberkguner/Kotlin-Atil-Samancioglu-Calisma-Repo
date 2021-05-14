package com.datanthuastic.kotlinlearning

fun main() {

    // - If - Else If - Else

    val gokberkAge = 21

    if (gokberkAge < 18) {
        println("18'den küçük.") // Hiçbir şey yazmaz.
    }
    else if (gokberkAge >= 18 && gokberkAge < 24) {
        println("18'den büyük ve 24'ten küçük.") // 18'den büyük ve 24'ten küçük.
    }
    else {
        println("24'ten büyük.") // Hiçbir şey yazmaz.
    }



}