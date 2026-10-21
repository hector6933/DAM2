package org.iesch.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.LogWriter
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Todo el código que tenemos aquí es porque se está ejecutando el oncreate

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val boton = findViewById<Button>(R.id.botonMain)
        boton.setOnClickListener {
            val intent = Intent(this, OtraActivity::class.java)
            startActivity(intent)
            finish() // Esto es para que cuando le des hacia atrás no se acumule y se cierre la app
        }

        Log.i("CICLOVIDA","MAIN - Entramos en el método onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLOVIDA","MAIN - Entramos en el método onDestroy()")
    }

}