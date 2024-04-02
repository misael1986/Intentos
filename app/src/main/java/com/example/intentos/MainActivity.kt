package com.example.intentos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        val textNombre= findViewById<EditText>(R.id.nombre)

        boton.setOnClickListener {
            val intent1 = Intent(this,otraClase::class.java)
            intent1.putExtra("nombre",textNombre.text.toString())
            startActivity(intent1)

        }

        }

}