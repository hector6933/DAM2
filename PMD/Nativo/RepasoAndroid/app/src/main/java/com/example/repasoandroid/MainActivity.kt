package com.example.repasoandroid

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.repasoandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var activo = true

    private var fotoBitmap: Bitmap? = null

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



        val getContent = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->

            if (bitmap != null) {

                fotoBitmap = bitmap
                binding.imagenLogin.setImageBitmap(bitmap)

            }

        }

        binding.imagenLogin.setOnClickListener {
            getContent.launch(null)
        }

        binding.btnEnviar.setOnClickListener {

            var nombre = binding.inputLogin.text.toString()
            var passwd = binding.inputLogin2.text.toString()

            if (fotoBitmap == null || nombre.isEmpty() || passwd.isEmpty()) {

                Toast.makeText(this, "Rellena todos los campos!!!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            var intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("imagen", fotoBitmap)
            intent.putExtra("nombre", nombre)

            startActivity(intent)
            activo = false

        }

    }

    override fun onResume() {
        super.onResume()

        if (!activo) {

            fotoBitmap = null
            binding.imagenLogin.setImageResource(android.R.drawable.ic_menu_camera)

            binding.inputLogin.requestFocus()
            binding.inputLogin.setText("")
            binding.inputLogin2.setText("")

            activo = true

        }

    }
}