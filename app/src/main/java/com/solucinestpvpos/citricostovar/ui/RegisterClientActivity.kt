package com.solucinestpvpos.citricostovar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solucinestpvpos.citricostovar.databinding.ActivityRegisterClientBinding

class RegisterClientActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterClientBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterClientBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarClientes)
        title = "Registro de Clientes"
    }
}