package com.datanthuastic.kotlinlearning

fun main() {

    // For Döngüsü

    val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)

    val q = myArrayOfNumbers[2] / 3 * 5
    println(q) // 30

    for (number in myArrayOfNumbers){
        val i = number / 3 * 5
        println(i)
    }
    // {20,25,30,35,40,45,50,55}

    for (i in myArrayOfNumbers.indices){
        val w = myArrayOfNumbers[i] / 3 * 5
        println(w)
    }
    // {20,25,30,35,40,45,50,55}

    for (num in 0..9){
        println(num)
    }
    // {0,1,2,3,4,5,6,7,8,9}

    val myStringArrayList = arrayListOf<String>()
    myStringArrayList.add("Gökberk")
    myStringArrayList.add("Güner")
    myStringArrayList.add("1")

    for (str in myStringArrayList){
        println(str)
    }
    // {Gökberk, Güner, 1}

    // Bu ArrayList'lere özel bir yapı ama sonuçta aynı sonucu veriyor.
    // Bunu da kullanabilirsin.

    myStringArrayList.forEach{ println(it) }
    // {Gökberk, Güner, 1}


    // - While Döngüsü -

    var j = 0
    while (j < 10){
        println(j)
        j++;
    }
    // {0,1,2,3,4,5,6,7,8,9}

}