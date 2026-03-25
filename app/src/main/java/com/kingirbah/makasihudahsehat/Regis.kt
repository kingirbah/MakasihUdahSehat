package com.kingirbah.makasihudahsehat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kingirbah.makasihudahsehat.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_regis.*

class Regis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        intentRegis()
        intenLogin()
    }

    private fun intenLogin() {
        login_btn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }

    private fun intentRegis() {
        btn_regis.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
            }
        }
    }

