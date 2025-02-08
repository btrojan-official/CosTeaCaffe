package com.example.costeacaffe

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listCat: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listCat = findViewById(R.id.listCat)

        listCat.setOnItemClickListener{ _, _, position, _ ->
            when(position){
                0 -> startActivity(Intent(this, DrinkCategoryActivity::class.java))
                1 -> startActivity(Intent(this, SnackCategoryActivity::class.java))
                else -> startActivity(Intent(this, LocalCategoryActivity::class.java))
            }
        }
    }
}