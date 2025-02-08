package com.example.costeacaffe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.costeacaffe.databinding.ActivityDrinkBinding

class DrinkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrinkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_drink)

        binding = ActivityDrinkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var drinkId = intent.getLongExtra("drinkId", -1)

        var drink = Drink.drinks[drinkId.toInt()]

        binding.icon.setImageResource(drink.img)
        binding.title.text = drink.name
        binding.description.text = drink.description
    }
}