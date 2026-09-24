package org.iesch.superheroes

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityDetailBinding
import org.iesch.superheroes.model.SuperHeroe

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

        // 1 - Recibimos el Objeto Superheroe del Intent
        val superHeroe = if ( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU ) {
            // Para versiones SON 33 o superiores
            intent.getParcelableExtra("superHeroe", SuperHeroe::class.java)

        } else {
            // Para versiones anteriores a la 33
            intent.getParcelableExtra<SuperHeroe>("superHeroe")

        }


        // Último paso: Recibimos los datos del Main Activity

        // Nos creamos el putísimo bundle

//        val superHeroName = datosRecibidos.getString("superHeroName") ?: "No hay nombre xDDDDDDDDDDDDDDDDDDDDDDD"
//        val alterEgo = datosRecibidos.getString("alterEgo") ?: "No hay alter ego ;(((("
//        val bio = datosRecibidos.getString("bio") ?: "No hay bio :|"
//        val power = datosRecibidos.getFloat("power")

        val bundle = intent.extras!!
        // var bitmap = bundle.getParcelable<Bitmap>("imagenHeroe")
        val bitmapDirectory = bundle.getString("path_heroe")
        val bitmap = BitmapFactory.decodeFile(bitmapDirectory)

        // Rellenamos los campos
        binding.heroNameTv.text = superHeroe?.nombre ?: "No hay nombre"
        binding.alterEgoResult.text = superHeroe?.alterEgo ?: "No hay AlterEgo"
        binding.bioResult.text = superHeroe?.bio ?: "No hay bio"
        binding.ratingBar2.rating = superHeroe?.power ?: 0f
        binding.imagenHeroe.setImageBitmap(bitmap)

    }
}