package com.thoriq.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.thoriq.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
//
//        val button: Button = findViewById(R.id.btn_action)
        binding.btnAction.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        val intentNew = Intent(this@MainActivity,NewActivity::class.java)
        intentNew.putExtra(NewActivity.EXTRA_NAMA, binding.etNama.text.toString())
        intentNew.putExtra(NewActivity.EXTRA_UMUR, binding.etUmur.text.toString())
        startActivity(intentNew)
    }
}