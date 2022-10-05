package com.willyramad.chapterlimauidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chapterlimauidesign.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIndo.setOnClickListener {
            setBahasa("id")
        }
        binding.btnEng.setOnClickListener {
            setBahasa("en")
        }
    }
    fun setBahasa(lang : String){
        val bahasa = Locale(lang)
        val res = resources
        val conf = res.configuration
        conf.locale = bahasa
        res.updateConfiguration(conf, res.displayMetrics)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}