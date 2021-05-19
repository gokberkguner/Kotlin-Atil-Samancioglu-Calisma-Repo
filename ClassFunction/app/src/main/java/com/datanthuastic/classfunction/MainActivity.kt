package com.datanthuastic.classfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        mySum(1,2)

        // Void - Unit
        val result = myMultiple(2,3)
        textView.text = "myMultiple: ${result}"

        /*
        button.setOnClickListener{
            println("clicked")
        }
        */

        // Class
        val gokberk = Guners("Gökberk Güner",21,"Software Engineer")

        // Private

        //gokberk.hairColor = "Black"

        // Object

        //gokberk.fullName = "Gökberk Güner"
        //gokberk.job = "Software Engineer"
        //gokberk.age = 21

        // Private olduğu için hata gösteriyor.
        // println(gokberk.hairColor)

        // Nullability
        // Nullable && Non-Null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null

        // 1) Null Safety
        if (myAge != null) {
            println(myAge * 10)
        } else {
            println("myAge null.")
        }

        // 2) Safe Call
        println(myAge?.compareTo(2))

        // 3) Elvis
        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)



    }

    fun test(){
        println("Test function")
    }

    // Input ve Return
    fun mySum(a: Int, b: Int){
        textView.text = "mySum: ${a+b}"
    }

    fun myMultiple(x: Int, y: Int) : Int{
        return x * y
    }

    fun helloKotlin(view : View){
        textView.text = "Hello Kotlin"
    }
}