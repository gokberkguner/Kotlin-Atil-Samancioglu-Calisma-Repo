package com.datanthuastic.kotlinlearning

fun main() {

    // - Switch <Diğer Programlama Dillerinde> - When <Kotlin'deki İsmi> -

    // Çok fazla else if kullanımından kaçınmak için kullanılır.

    val day = 3
    var dayString = ""

    if (day == 1){
        dayString = "Monday"
    }
    else if (day == 2){
        dayString = "Tuesday"
    }
    else if (day == 3){
        dayString = "Wednesday"
    }

    println(dayString) // Wednesday

    // Bu işlemi Switch kullanarak yapmaya çalışırsak;

    when(day) {
        1 -> dayString = "Monday"
        2 -> dayString = "Tuesday"
        3 -> dayString = "Wednesday"
        else -> dayString = ""
    }

    println(dayString) // Wednesday <Yine aynı sonuca ulaşmış oluruz. Kullanım açısından daha kolay duruyor.>



}