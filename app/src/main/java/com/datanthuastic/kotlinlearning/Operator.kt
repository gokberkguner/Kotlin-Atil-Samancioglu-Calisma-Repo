package com.datanthuastic.kotlinlearning

fun main() {

    // Operator

    var m = 5
    println(m) // 5

    // Bunun yerine m++ da kullanabiliriz daha kısa haliyle.
    m = m + 1
    println(m) // 6

    m++
    println(m) // 7

    // Çıkartma işlemlerinde de m-- kullanılabilir.
    m--
    println(m) // 6

    // <->

    var n = 7
    println(n > m) // true

    // && - ||

    println(n > m && 2 > 1) // true && true => true
    // [&& olduğu zaman ifadeninin tümünün true olması için, ifadedeki her elemanın true olması gerekir.]
    println(n > m || 1 > 2) // true || false => true
    // [|| olduğu zaman ifadede bir doğru olması, tüm ifadeninin true olmasını sağlar.]

    // % <Kalan><Reminder>

    println("Kalan: ${10/4}") // Kalan: 2





}