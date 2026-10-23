package com.examenpmdm.hectorcriado

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.examenpmdm.hectorcriado.databinding.ActivityPreguntaBinding

class Pregunta : AppCompatActivity() {

    private lateinit var binding: ActivityPreguntaBinding

    private var pregunta = 0
    var repite = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPreguntaBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_pregunta)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnComprobar.setOnClickListener {

            var intent = Intent(this, Resultado::class.java)


            // Mejoras
            if (binding.radioGroup.checkedRadioButtonId < 0) {

                Toast.makeText(this, "¡¡Selecciona alguna opción!!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }

//            Mejoras:
//            val acertado = when (pregunta) {
//                1 -> binding.respuesta3.isChecked
//                2 -> binding.respuesta4.isChecked
//                3 -> binding.respuesta2.isChecked
//                else -> false
//            }
//
//            intent.putExtra("acertado", acertado)
//            repite = !acertado


//          Mejoras:
//          Forma tope guapa de hacerlo:
            val correctas = mapOf(
                1 to R.id.respuesta3,
                2 to R.id.respuesta4,
                3 to R.id.respuesta2
            )

            val acertado = binding.radioGroup.checkedRadioButtonId == correctas[pregunta]

            intent.putExtra("acertado", acertado)
            repite = !acertado

            intent.putExtra("pregunta",pregunta)
            startActivity(intent)

        }

        mostrarPregunta()

    }

    fun mostrarPregunta() {

        when (pregunta) {

            1 -> {

                binding.textoNumeroPrueba.text = "Prueba 1/3"
                binding.textoPregunta.text =
                    "Encuentras un ordenador bloqueado.\n¿Qué protocolo utilizarías para acceder de forma segura a una página web?"
                binding.respuesta1.text = "FTP"
                binding.respuesta2.text = "HTTP"
                binding.respuesta3.text = "HTTPS"
                binding.respuesta4.text = "Telnet"

            }

            2 -> {

                binding.textoNumeroPrueba.text = "Prueba 2/3"
                binding.textoPregunta.text =
                    "Una puerta tiene un teclado númerico.\n¿Qué contraseña sería más segura?"
                binding.respuesta1.text = "123456"
                binding.respuesta2.text = "111111"
                binding.respuesta3.text = "01012006"
                binding.respuesta4.text = "T7#kp9!x"

            }

            3 -> {

                binding.textoNumeroPrueba.text = "Prueba 3/3"
                binding.textoPregunta.text =
                    "Necesitas enviar información confidencial. ¿Qué opción es más adecuada?"
                binding.respuesta1.text = "Enviarla sin protección"
                binding.respuesta2.text = "Utilizar cifrado"
                binding.respuesta3.text = "Publicarla en redes sociales"
                binding.respuesta4.text = "Utilizar una contraseña sencilla"

            }
        }

    }

    override fun onResume() {
        super.onResume()

        if (!repite) {

            pregunta++

        }

        repite = false

        binding.radioGroup.clearCheck()
        mostrarPregunta()

    }
}