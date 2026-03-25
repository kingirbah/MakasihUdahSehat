package com.kingirbah.makasihudahsehat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dokter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dokter)

        val btnpilih1 = findViewById<Button>(R.id.pilih1)
        btnpilih1.setOnClickListener {
            val intent = Intent(this, konsul::class.java)
            startActivity(intent)
        }

        val btnpilih2 = findViewById<Button>(R.id.pilih2)
        btnpilih2.setOnClickListener {
            val intent = Intent(this, konsul::class.java)
            startActivity(intent)
        }

        val btnpilih3 = findViewById<Button>(R.id.pilih3)
        btnpilih3.setOnClickListener {
            val intent = Intent(this, konsul::class.java)
            startActivity(intent)
        }
    }
}
