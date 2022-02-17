package com.solucinestpvpos.citricostovar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.databinding.ActivityRegisterClientBinding
import com.solucinestpvpos.citricostovar.databinding.ActivityRegisterProviderBinding

class RegisterProviderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterProviderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterProviderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarProvider)
        title = "Registro de Proveedores"
    }
}