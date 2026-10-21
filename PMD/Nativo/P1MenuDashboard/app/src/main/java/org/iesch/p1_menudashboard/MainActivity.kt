package org.iesch.p1_menudashboard

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.p1_menudashboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_main)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var bundle = intent.extras!!

        findViewById<TextView>(R.id.textView3).text = bundle.getString("nombre").toString().ifEmpty { "Sin nombre" }

        binding.btnEdadCanina.setOnClickListener {

            startActivity(Intent(this, EdadCaninaMainActivity::class.java))

        }

        binding.btnSuper.setOnClickListener {

            startActivity(Intent(this, SuperHeroeMainActivity::class.java))

        }

        binding.btnQuizz.setOnClickListener {

            startActivity(Intent(this, MainQuizz::class.java))

        }

    }
}