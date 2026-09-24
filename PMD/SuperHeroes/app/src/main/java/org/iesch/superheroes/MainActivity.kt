package org.iesch.superheroes

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Environment
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityMainBinding
import org.iesch.superheroes.model.SuperHeroe
import java.io.File

class MainActivity : AppCompatActivity() {

    // 1 - Creamos la variable de lateinit porque la vamos a inicializar luego
    private lateinit var binding: ActivityMainBinding

    // 1 - Creamos una variable que va a manejar el resultado de haver hecho la foto
    private lateinit var heroImage: ImageView
    private var heroBitmap: Bitmap? = null
    private var picturePath = ""
    private var getContent = registerForActivityResult(ActivityResultContracts.TakePicture()) {
        // Ahor en lugar de un bitmap nos va devolver un booleano, si la foto es exitosa o no
        success ->
            if (success && picturePath.isNotEmpty()) {
                // Cualquier imagen de directorio la podemos convertir a bitmap
                heroBitmap = BitmapFactory.decodeFile(picturePath)
                // Mostramos la imagen en el cuadradito
                heroImage.setImageBitmap(heroBitmap)
            }

    }

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

        // 2 - Linkar el elemento con abrir la cámara
        heroImage = binding.HeroNameImage
        binding.HeroNameImage.setOnClickListener {
            abrirCamara()
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

    fun abrirCamara() {
        // 2 - Aquí debemos crear un path temporal para guardar esa imagen
        val imageFile = crearImagenFile()

        // Ahora ya tenemos el archivo de tipo File, pero lo que necesitamos es el uri
        // Será a través del FileProvider
        // FileProvider lo que hace es compartir el File con otras aplicaciones de forma segura
        val uri = FileProvider.getUriForFile(this, "${applicationContext.packageName}.provider", imageFile)
        getContent.launch(uri)
    }

    // 3 - Esta función crea un File y de ese File recuperaremos la uri
    private fun crearImagenFile() : File {

        // Irse al manifest y meter un permiso

        val fileName = "superHeroImage"
        // Esto será el directorio donde vamos a almacenar la imagen.. Por defecto es DIRECTORY_PICTURES
        val fileDirectory = getExternalFilesDir(Environment.DIRECTORY_PICTURES)

        // Creamos nuestro File, aquí nos pide el nombre, en formato, y el directorio
        val imageFile = File.createTempFile(fileName, ".jpg", fileDirectory)
        // Ahora ya podemos guardar la ruta (path) en la variable global
        picturePath = imageFile.absolutePath
        return imageFile


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
        // Añado el Objeto Bitmap
        intent.putExtra("path_heroe",picturePath)
        // De esta manera todos estos datos se enviarán al DetailActivity
        // Iniciamos la nueva actividad
        startActivity(intent)

    }
}