package com.example.coteacaffe

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
    }
}