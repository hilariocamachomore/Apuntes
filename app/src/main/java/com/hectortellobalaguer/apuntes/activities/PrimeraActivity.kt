package com.hectortellobalaguer.apuntes.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hectortellobalaguer.apuntes.R

class PrimeraActivity : AppCompatActivity() {

    var tvSaludo: TextView? = null
    var etNombre: EditText? = null
    var btnComienzo: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        tvSaludo = findViewById(R.id.tvSaludo)
        etNombre = findViewById(R.id.etNombre)

        btnComienzo = findViewById(R.id.btnComienzo)
        btnComienzo?.setOnClickListener {
            if (etNombre?.text!!.isNotEmpty()) {
                tvSaludo?.text = "Holasss ${etNombre?.text}"
            }else{
                tvSaludo?.text = "Hola Anónimo"
            }
        }

    }


}