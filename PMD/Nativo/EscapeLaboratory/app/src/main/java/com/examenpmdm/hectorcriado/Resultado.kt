package com.examenpmdm.hectorcriado

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.examenpmdm.hectorcriado.databinding.ActivityResultadoBinding

class Resultado : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityResultadoBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_resultado)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var acertado = intent.getBooleanExtra("acertado", false)

        var pregunta = intent.getIntExtra("pregunta", 0)

        var imagen = binding.imagenResultado

        var texto1 = binding.textoResultado
        var texto2 = binding.textoResultado2
        var boton = binding.btnResultado

//      Arreglado:
//      El if == 3 estaba fuera de acertado, de tal forma que si en la pregunta 3 lo acertaba o no le saía la pantalla final
        boton.setOnClickListener {

            finish()

        }

        if (acertado) {

            imagen.setImageResource(R.drawable.icono_bien)
            texto1.text = "¡CORRECTO!"
            texto2.text = "Has superado la prueba"
            boton.text = "SIGUIENTE PRUEBA"

            if (pregunta == 3) {

                boton.text = "VER RESULTADO"
                boton.setOnClickListener {

                    imagen.setImageResource(R.drawable.icono_escapado)
                    texto1.text = "Has superado las 3 pruebas"
                    texto1.text = "Aciertos: 3/3"
                    boton.text = "VER RESULTADO"
                    boton.text = "JUGAR DE NUEVO"
                    boton.setOnClickListener {

                        startActivity(Intent(this, Pregunta::class.java))

                    }

                }

            }

        } else {

            imagen.setImageResource(R.drawable.icono_mal)
            texto1.text = "INCORRECTO"
            texto2.text = "No has conseguido superar esta prueba"
            boton.text = "INTENTAR DE NUEVO"

        }


    }
}