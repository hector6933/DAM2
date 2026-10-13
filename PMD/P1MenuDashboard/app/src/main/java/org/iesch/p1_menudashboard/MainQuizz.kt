package org.iesch.p1_menudashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.p1_menudashboard.databinding.ActivityMainQuizzBinding

class MainQuizz : AppCompatActivity() {

    private lateinit var binding: ActivityMainQuizzBinding

    var pregunta = 1
    var puntuacion = 0
    var correcto = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainQuizzBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_main_quizz)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (intent.getBooleanExtra("restart",false)) {

            pregunta = 1
            puntuacion = 0

        }

        var totalPreguntas = 3.0

        binding.btnSend.setOnClickListener {

            val resp1 = binding.respuesta1
            val resp2 = binding.respuesta2

            if (!resp1.isChecked && !resp2.isChecked) {
                Toast.makeText(this, "Selecciona una respuesta", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val preguntaRespondida = pregunta

            val seleccionado = if (resp1.isChecked) 1 else 2

            val intent = Intent(this, CheckQuizz::class.java)

            if (seleccionado == correcto) {
                intent.putExtra("correcto", true)
                puntuacion++
            } else {
                intent.putExtra("correcto", false)
            }

            if (pregunta < 3) {
                pregunta++
            }

            intent.putExtra("puntuacion", puntuacion)

            intent.putExtra("pregunta", preguntaRespondida)

            startActivity(intent)
        }

        mostrarPregunta()
    }

    private fun mostrarPregunta() {

        when (pregunta) {
            1 -> {
                binding.textoProgreso.text = "1 / 3"
                binding.progressBar.progress = 33
                binding.textoPregunta.text =
                    "What value of y is a solution to this equation?"
                binding.textoEcuacion.text = "10 y = 70"
                binding.respuesta1.text = "y = 7"
                binding.respuesta2.text = "y = 23"
                correcto = 1
            }

            2 -> {
                binding.textoProgreso.text = "2 / 3"
                binding.progressBar.progress = 66
                binding.textoPregunta.text =
                    "What value of x is a solution to this equation?"
                binding.textoEcuacion.text = "8 x = 56"
                binding.respuesta1.text = "x = 6"
                binding.respuesta2.text = "x = 7"
                correcto = 2
            }

            3 -> {
                binding.textoProgreso.text = "3 / 3"
                binding.progressBar.progress = 100
                binding.textoPregunta.text =
                    "What value of y is a solution to this equation?"
                binding.textoEcuacion.text = "6 y = 42"
                binding.respuesta1.text = "y = 7"
                binding.respuesta2.text = "y = 8"
                correcto = 1
            }
        }

    }

    // Onresume para cuando vuelva del CheckQuizz
    override fun onResume() {
        super.onResume()

        // Espero a que el binding cargue
        if (::binding.isInitialized) {

            // Muestro la pregunta y limpio los checks
            mostrarPregunta()
            binding.grupoRespuestas.clearCheck()

        }
    }

}