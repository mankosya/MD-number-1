package com.example.firstlesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
   lateinit var editText: EditText
   lateinit var button: Button
   lateinit var top: ImageView
    lateinit var tshirt: ImageView
    lateinit var blouse: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.edittext)
        top=findViewById(R.id.top)
        tshirt=findViewById(R.id.tshirt)
        blouse=findViewById(R.id.blouse)
        button=findViewById(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            when{
                editText.text.toString() == "1" -> intent.putExtra("PICTURE", R.drawable.ic_top)
                editText.text.toString() == "2" -> intent.putExtra("PICTURE", R.drawable.ic_tshirt)
                editText.text.toString() == "3" -> intent.putExtra("PICTURE", R.drawable.ic_blouse)
                else -> {
                    Toast.makeText(this, "Введите цифру из предложенных!", Toast.LENGTH_SHORT).show()
                }
            }
            startActivity(intent)
        }

        }
    }


