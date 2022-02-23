package com.solucinestpvpos.citricostovar.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solucinestpvpos.citricostovar.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login.setOnClickListener {
            val intent = Intent(this, ListClientsActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}