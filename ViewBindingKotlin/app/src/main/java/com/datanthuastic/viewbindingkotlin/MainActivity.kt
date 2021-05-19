package com.datanthuastic.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.datanthuastic.viewbindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // 1-)
    //private  lateinit var textView: TextView

    // 3-)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        // 1-)
        //textView = findViewById<TextView>(R.id.textView)
    }

    fun changeName(view : View) {
        // 2-)
        //textView.text = "Merhaba Kotlin"

        // 3-)
        binding.textView.text = "18 Mayıs 2021 - Kotlin"
    }

}