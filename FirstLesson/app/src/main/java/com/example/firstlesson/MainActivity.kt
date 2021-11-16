package com.example.firstlesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var firstName: EditText
    lateinit var age: EditText
    lateinit var birthDate: EditText

    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName = findViewById(R.id.first_name)
        age = findViewById(R.id.ageEditText)
        birthDate = findViewById(R.id.Date)
        saveBtn = findViewById(R.id.saveBtn)

        saveBtn.setOnClickListener {
            val name = firstName.text.toString()
            val age = age.text.toString().toInt()
            val dayOfBirth = birthDate.text.toString()
//            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("DATE", dayOfBirth)
            startActivity(intent)
        }
    }
}