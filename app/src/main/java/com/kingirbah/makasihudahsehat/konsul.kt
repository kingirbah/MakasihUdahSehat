package com.kingirbah.makasihudahsehat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.kingirbah.makasihudahsehat.view.main.MainActivity

class konsul : AppCompatActivity() {
    lateinit var nama: EditText
    lateinit var usia: EditText
    lateinit var noTlp: EditText
    lateinit var keluh: EditText
    lateinit var btn_save: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsul)

        nama = findViewById(R.id.namakeluhan)
        usia = findViewById(R.id.usiakeluhan)
        noTlp = findViewById(R.id.telpkeluhan)
        keluh = findViewById(R.id.keluhan)
        btn_save = findViewById(R.id.btnsave)

        btn_save.setOnClickListener {
            val namapasien = nama.text.toString()
            val usiaPasien = usia.text.toString()
            val noPasien = noTlp.text.toString()
            val keluhPasien = keluh.text.toString()

            val intent = Intent(this@konsul, konsul2::class.java)

            intent.putExtra("nama", namapasien)
            intent.putExtra("usia", usiaPasien)
            intent.putExtra("no telpon", noPasien)
            intent.putExtra("Keluhan", keluhPasien)

            startActivity(intent)
        }
    }
}
