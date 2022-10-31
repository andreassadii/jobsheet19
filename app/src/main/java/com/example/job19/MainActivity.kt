package com.example.job19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val angka = findViewById<EditText>(R.id.Angka)
        val cekBtn = findViewById<Button>(R.id.btn)

        cekBtn.setOnClickListener{
            cekGanjilGenap(angka.text.toString().toInt())
        }
    }

    fun cekGanjilGenap(angka: Int) {
        if (angka%2 == 0) {
            Toast.makeText(this, "Bilangan Genap", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Bilangan Ganjil",Toast.LENGTH_SHORT).show()
        }
    }
}