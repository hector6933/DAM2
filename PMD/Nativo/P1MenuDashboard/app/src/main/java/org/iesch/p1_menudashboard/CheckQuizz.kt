package org.iesch.p1_menudashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.p1_menudashboard.databinding.ActivityCheckQuizzBinding

class CheckQuizz : AppCompatActivity() {

    private lateinit var binding: ActivityCheckQuizzBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print("oncreate")

        enableEdgeToEdge()
        binding = ActivityCheckQuizzBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // setContentView(R.layout.activity_check_quizz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var pregunta = intent.getIntExtra("pregunta", 0)

        if (pregunta == 3) {

            var puntuacion = intent.getIntExtra("puntuacion",0)
            binding.textoFin.text = "¡Quizz completed!"
            binding.puntuacion.text = "Acertadas: ${puntuacion}/3"
            binding.btnSend.text = "Start Again"
            intent.putExtra("restart",true)


        }

        var correcto = intent.getBooleanExtra("correcto",false)

        if (correcto) {

            binding.imagenCheck.setImageResource(R.drawable.bien)
            binding.textoCheck.text = "Right!"
            binding.textoCheck2.text = "You have choosen the correct answer!"

        } else {

            binding.imagenCheck.setImageResource(R.drawable.mal)
            binding.textoCheck.text = "WROOONGG!"
            binding.textoCheck2.text = "You have choosen the INCORRECT answer!"

        }

        binding.btnSend.setOnClickListener {

            if (pregunta == 3) {

                startActivity(Intent(this, MainQuizz::class.java))

            } else {

                finish()

            }

        }

    }
}