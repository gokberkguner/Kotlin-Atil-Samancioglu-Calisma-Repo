package com.datanthuastic.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables

        var x = 5
        var y = 4
        println(x*y)

        var age: Int = 35
        println(age + 5)


        // Constants (Value)

        val age2: Int = 40

        // Integer

        var gokberksAge: Int = 21
        var gokalpsAge: Int = 16

        val sumAges = gokberksAge + gokalpsAge

        println(sumAges)


        // Defining
        var year : Int

        // Initialize
        year = 2021
        year = 2022

        // Double
        val pi: Double = 3.14

        // Float
        var ortalama: Float = 3.52F

        // Long
        var myLong : Long
        myLong = 1

        //camelCase
        //snake_case

        // String
        val departmentName: String
        departmentName = "Software Engineering"

        println("Department Name: ${departmentName}")

        val isim : String
        isim = "Gökberk"

        val soyisim : String
        soyisim = "Güner"

        val tumIsim = isim + soyisim
        println("İsim/Soyisim: ${isim + " " + soyisim}")


        // Boolean

        var myBoolean: Boolean = true
        myBoolean = false

        var isDead: Boolean
        isDead = false

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && (and)
        // || (or)

        println(3 < 5)

        //Conversion
        println(pi.toInt())

        var input: String = "10"
        println(input.toInt() + 5)


        // Collections
        // Arrays

        val myArray = arrayOf("Gökberk", "Arda", "Kerem", "Berke")
        // Index
        println(myArray[0])
        myArray[0] = "Gökberk Güner"
        println(myArray[0])
        println(myArray) // Ljava.lang.String;@713b9aa

        myArray.set(1, "Arda Orkun")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        //println(numberArray[5])


        val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
        val karisik = arrayOf(1, "KEKW")
        println(karisik[0])
        println(karisik[1])


        // List - ArrayList

        val myMusicians = arrayListOf<String>()
        myMusicians.add("Asrın")
        myMusicians.add("Gökberk")
        myMusicians.add("Ömer")
        myMusicians.add("Arda")
        myMusicians.add(0, "Emre")

        println(myMusicians)

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(99)

        val mixedArrayList = ArrayList<Any>()
        mixedArrayList.add("SX")
        mixedArrayList.add("Vintage Jazz Bass")
        mixedArrayList.add(1.654)
        mixedArrayList.add(true)

        println(mixedArrayList)











    }
}