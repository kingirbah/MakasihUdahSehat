package com.kingirbah.makasihudahsehat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kingirbah.makasihudahsehat.view.main.MainActivity

class konsul2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsul2)

        val btn_back = findViewById<Button>(R.id.btnback)

        val diagnosa = findViewById<TextView>(R.id.output)

        val messagediagnosa = intent.getStringExtra("Keluhan")

        diagnosa.text = "Sesuai dengan keluhan pasien, yaitu: \n" + messagediagnosa + "\n  \nPasien didiagnosa mengidap penyakit typhus. \n \nObat yang dianjurkan adalah : \n1. Floxigra 500mg untuk antibiotik \n2. Paracetamol untuk menurunkan demam \n \nApabila gejala dan keluhan yang dirasakan tak kunjung reda, maka pasien dianjurkan untuk melakukan kosnultasi kembali."

        btn_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
