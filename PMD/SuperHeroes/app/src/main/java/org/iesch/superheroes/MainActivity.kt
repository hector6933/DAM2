package org.iesch.superheroes

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityMainBinding
import org.iesch.superheroes.model.SuperHeroe

class MainActivity : AppCompatActivity() {

    // 1 - Creamos la variable de lateinit porque la vamos a inicializar luego
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // 2 - Inicializamos el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // 3 - Usamos el binding para inflar la vista
        // Antes había esto setContentView(R.layout.activity_main)
        setContentView(binding.root) // Y ya está
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // A partir de aquí introduzco el código necesario
        // antes había esto ahora no val botonGuardar = findViewById<Button>(R.id.botonGuardar)
        binding.botonGuardar.setOnClickListener {
            // Obtenemos los valores al momento de hacer click
            // Cosas de activity main
            // val superHeroName = findViewById<EditText>(R.id.heroNameEdit).text.toString()
            val superHeroName = binding.heroNameEdit.text.toString()
            val alterEgo = binding.alterEgoEdit.text.toString()
            val bio = binding.editTextText3.text.toString()
            val power = binding.power.rating

            // 2 - Me creo el objeto SuperHeroe
            val superHeroe = SuperHeroe(superHeroName,alterEgo,bio,power)

            // Qué quiero hacer cuando pulso el botón guardar
            irADetailActivity(superHeroe)

        }

    }

    fun irADetailActivity(superHeroe: SuperHeroe) {
        // Creamos el objeto intent
        val intent = Intent(this, DetailActivity::class.java)
        // Añadimos todos los campos con el método putExtra
//        intent.putExtra("superHeroName",superHeroName)
//        intent.putExtra("alterEgo",alterEgo)
//        intent.putExtra("bio",bio)
//        intent.putExtra("power",power)
        intent.putExtra("superHeroName", superHeroe.nombre)
        intent.putExtra("alterEgo", superHeroe.alterEgo)
        intent.putExtra("bio", superHeroe.bio)
        intent.putExtra("power", superHeroe.power)
        intent.putExtra("superHeroe",superHeroe)
        // De esta manera todos estos datos se enviarán al DetailActivity
        // Iniciamos la nueva actividad
        startActivity(intent)

    }
}