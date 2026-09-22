package org.iesch.superheroes

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    // 1 - Creamos la variable de lateinit porque la vamos a inicializar luego
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // 2 - Inicializamos el binding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_detail)
        // Antes había esto setContentView(R.layout.activity_main)
        setContentView(binding.root) // Y ya está
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Último paso: Recibimos los datos del Main Activity

        // Nos creamos el putísimo bundle
        val datosRecibidos = intent.extras!!
        val superHeroName = datosRecibidos.getString("superHeroName") ?: "No hay nombre xDDDDDDDDDDDDDDDDDDDDDDD"
        val alterEgo = datosRecibidos.getString("alterEgo") ?: "No hay alter ego ;(((("
        val bio = datosRecibidos.getString("bio") ?: "No hay bio :|"
        val power = datosRecibidos.getFloat("power")

        // Rellenamos los campos
        binding.heroNameTv.text = superHeroName
        binding.alterEgoResult.text = alterEgo
        binding.bioResult.text = bio
        binding.ratingBar2.rating = power

    }
}