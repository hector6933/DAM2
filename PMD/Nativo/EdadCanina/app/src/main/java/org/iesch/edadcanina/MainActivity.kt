package org.iesch.edadcanina

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Aquí la pantalla está creada.

        // 1 - Tomamos el control de todos los elementos de la parte de la interfaz

        val resultText = findViewById<TextView>(R.id.texto_respuesta)
        val calculateButton = findViewById<Button>(R.id.boton_calcular)
        val ageEdit = findViewById<EditText>(R.id.edit_edad)

        // 2 - Los botones tienen la propiedad setonClickListener al pulsarlo

        calculateButton.setOnClickListener {

            // Aquí metemos el código de lo que queremos hacer cuando pulsemos el botón
            // Necesitamos pasar el valor a entero
            if (!ageEdit.text.toString().isEmpty()) {

                val edadInt = ageEdit.text.toString().toInt()

                val dogAge = edadInt*7
                // resultText.text = "Si fueras un perro tendrías $dogAge años"
                resultText.text = getString(R.string.texto_respuesta, dogAge)

            } else {

                Toast.makeText(this, "Introduce algo, hijo de puta!", Toast.LENGTH_LONG).show()

            }

        }

    }
}