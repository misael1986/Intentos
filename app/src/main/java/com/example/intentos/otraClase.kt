package com.example.intentos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class otraClase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otra_clase)

        val textoResultado= findViewById<TextView>(R.id.resultado)
        val nombre= intent.getStringExtra("nombre")
        textoResultado.text="Hola, "+nombre+"!"


    }

}
