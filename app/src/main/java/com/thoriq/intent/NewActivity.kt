package com.thoriq.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.thoriq.intent.databinding.ActivityMainBinding

class NewActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    companion object{
        const val EXTRA_UMUR = "umur"
        const val EXTRA_NAMA = "nama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_new)

        val nama = intent.getStringExtra(EXTRA_NAMA)
        val umur = intent.getStringExtra(EXTRA_UMUR)

        var tvExtra : TextView = findViewById(R.id.tv_extra)

        tvExtra.text = "Nama = $nama, Umur = $umur"

    }
}

