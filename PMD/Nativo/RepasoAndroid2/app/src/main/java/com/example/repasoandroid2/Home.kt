package com.example.repasoandroid2

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.repasoandroid2.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var nombre = intent.getStringExtra("nombre")
        binding.textoSaludo.text = getString(R.string.saludo, nombre)

        var imagenBitmap = intent.getParcelableExtra<Bitmap>("img")
        binding.imagenPerfil.setImageBitmap(imagenBitmap)

        binding.btnVolver.setOnClickListener {
            finish()
        }

        binding.card1.setOnClickListener {

            Toast.makeText(this, "Clicked card 1", Toast.LENGTH_SHORT).show()

        }
        binding.card2.setOnClickListener {

            Toast.makeText(this, "Clicked card 2", Toast.LENGTH_SHORT).show()

        }
        binding.card3.setOnClickListener {

            Toast.makeText(this, "Clicked card 3", Toast.LENGTH_SHORT).show()

        }
        binding.card4.setOnClickListener {

            Toast.makeText(this, "Clicked card 4", Toast.LENGTH_SHORT).show()

        }

        binding.card5.setOnClickListener {

            Toast.makeText(this, "Clicked card 5", Toast.LENGTH_SHORT).show()

        }



    }
}