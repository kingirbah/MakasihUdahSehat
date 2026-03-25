package com.kingirbah.makasihudahsehat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import com.kingirbah.makasihudahsehat.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    private lateinit var google: ImageButton
    private lateinit var nama: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        intentBottonRegist()
        intentLP()
        nama = findViewById(R.id.namaUser)

        intentMasuk()
    }

    private fun intentMasuk() {
        masuk.setOnClickListener {
            val nama = namaUser.text.toString().trim()
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Nama", nama)
            }
            startActivity(intent)
            finish()
        }
    }

    private fun intentLP() {
        lupa.setOnClickListener {
            startActivity(Intent(this, LupaPassword::class.java))
            finish()
        }
    }

    private fun intentBottonRegist() {
        btn_daftar.setOnClickListener {
            startActivity(Intent(this, Regis::class.java))
            finish()
        }
    }
}
