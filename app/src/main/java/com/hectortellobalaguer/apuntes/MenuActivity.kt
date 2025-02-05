package com.hectortellobalaguer.apuntes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hectortellobalaguer.apuntes.activities.PrimeraActivity

class MenuActivity : AppCompatActivity() {
    var btnActivityPrimera: Button?= null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnActivityPrimera = findViewById(R.id.btnActivityPrimera)
        btnActivityPrimera?.setOnClickListener {
            irActividadPrimera()
        }

    }

    private fun irActividadPrimera() {

        Toast.makeText(this, "prueba", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, PrimeraActivity::class.java)
        startActivity(intent)
    }


}