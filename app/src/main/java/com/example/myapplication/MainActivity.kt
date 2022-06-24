package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCancelar.setOnClickListener {
            Toast.makeText(this, "Estas precionando Cancelar", Toast.LENGTH_SHORT).show()

        }
        binding.btnAceptar.setOnClickListener {
            Toast.makeText(this, "Estas precionando Aceptar", Toast.LENGTH_SHORT).show()
            System.exit(0)
        }

    }
}