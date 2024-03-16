package com.chusdevil.applol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciar()
    }

    private fun iniciar() {
        val boton : Button = findViewById(R.id.btnBoton)
        val editText : EditText = findViewById(R.id.etTexto)

        boton.setOnClickListener {
            val texto = editText.text.toString()
            val intent = Intent(this, RespuestaActivity::class.java)
            intent.putExtra("TEXTO", texto)
            if (texto=="lol"){
                startActivity(intent)
            }else{
                Toast.makeText(this, "Inténtalo de nuevo", Toast.LENGTH_SHORT).show()
            }
        }
    }

}