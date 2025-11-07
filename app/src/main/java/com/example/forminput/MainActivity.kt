package com.example.forminput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNama = findViewById<EditText>(R.id.inputNama)
        val tombolTampil = findViewById<Button>(R.id.btnTampil)
        val hasilText = findViewById<TextView>(R.id.txtHasil)

        tombolTampil.setOnClickListener {
            val nama = inputNama.text.toString()

            if (nama.isEmpty()) {
                hasilText.text = "Silakan isi nama terlebih dahulu!"
            } else {
                hasilText.text = "Halo, $nama! Selamat datang di aplikasi Android 🎉"
            }
        }
    }
}
