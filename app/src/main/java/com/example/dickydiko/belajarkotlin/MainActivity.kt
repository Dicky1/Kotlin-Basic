package com.example.dickydiko.belajarkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.putraxor.codepolitan.R.layout.activity_main)
        tombol_sapa.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.tombol_sapa) {
            var nama = field_nama.text.toString()
            Toast.makeText(this, "Halo $nama, selamat belajar Kotlin", Toast.LENGTH_SHORT)
        }
    }
}