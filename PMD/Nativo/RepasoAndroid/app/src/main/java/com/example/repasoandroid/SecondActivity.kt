package com.example.repasoandroid

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.repasoandroid.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_second)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nombre = intent.getStringExtra("nombre").toString()

        if (nombre.isEmpty()) {

            binding.textNombre.text = "Sin nombre"

        } else {

            binding.textNombre.text = getString(R.string.saludo, nombre)

        }

        binding.imagenUsuario.setImageBitmap(intent.getParcelableExtra("imagen"))

        binding.btnLogout.setOnClickListener {
            finish()
        }

        binding.card1.setOnClickListener {
            Toast.makeText(this, "Card1", Toast.LENGTH_SHORT).show()
        }
        binding.card2.setOnClickListener {
            Toast.makeText(this, "Card2", Toast.LENGTH_SHORT).show()
        }
        binding.card3.setOnClickListener {
            Toast.makeText(this, "Card3", Toast.LENGTH_SHORT).show()
        }
        binding.card4.setOnClickListener {
            Toast.makeText(this, "Card4", Toast.LENGTH_SHORT).show()
        }
        binding.card5.setOnClickListener {
            Toast.makeText(this, "Card5", Toast.LENGTH_SHORT).show()
        }
        binding.card6.setOnClickListener {
            Toast.makeText(this, "Card6", Toast.LENGTH_SHORT).show()
        }


    }
}