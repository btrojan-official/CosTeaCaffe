package com.example.costeacaffe

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DrinkCategoryActivity : AppCompatActivity() {
    private lateinit var listDrinks: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_drink_category)

        listDrinks = findViewById(R.id.listDrinks)
        val drinkArrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            Drink.drinks
        )

        listDrinks.adapter = drinkArrayAdapter

        listDrinks.setOnItemClickListener { _, _, _, id ->
            startActivity(Intent(this, DrinkActivity::class.java).putExtra("drinkId", id))
        }
    }
}