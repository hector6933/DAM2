package com.example.repasoandroid2

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.repasoandroid2.databinding.ActivityHomeBinding
import com.example.repasoandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var enviado = false

    private var imagenBitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var imagen = binding.imagenLogin


        var getContent = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->

            if (bitmap != null) {

                imagenBitmap = bitmap
                imagen.setImageBitmap(imagenBitmap)

            }

        }

        imagen.setOnClickListener {

            getContent.launch(null)

        }

        binding.btnEnviar.setOnClickListener {

            val intent = Intent(this, Home::class.java)

            var nombre = binding.inputNombre.text.toString()
            var passwd = binding.inputPasswd.text.toString()

            if (nombre.isEmpty() || passwd.isEmpty() || imagenBitmap == null) {

                Toast.makeText(this, "¡¡ Rellena todos los campos !!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }

            intent.putExtra("nombre",nombre)
            intent.putExtra("passwd", passwd)
            intent.putExtra("img", imagenBitmap)

            startActivity(intent)
            enviado = true


        }

    }

    override fun onResume() {
        super.onResume()
        Log.i("Main Activity", "Entrado en onResume")

        if (enviado) {

            enviado = false

            // Vacío todos los campos para cuando vuelva

            binding.inputNombre.setText("")
            binding.inputNombre.requestFocus()

            binding.inputPasswd.setText("")

            binding.imagenLogin.setImageResource(android.R.drawable.ic_menu_camera)

            imagenBitmap = null

        }

    }

}