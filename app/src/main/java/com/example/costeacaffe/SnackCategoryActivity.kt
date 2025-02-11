package com.example.costeacaffe

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONArray

class SnackCategoryActivity : AppCompatActivity() {

    private lateinit var listSnack: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_category_acivity)

        val text = assets.open("snacks.json")
            .bufferedReader()
            .use { it.readText() }

        val jsonArray = JSONArray(text)
        val snacks = mutableListOf<Snack>()

        for(i in 0 until jsonArray.length()){
            val snack = jsonArray.getJSONObject(i)
            snacks.add(
                Snack(
                    snack.getString("name"),
                    snack.getString("desc"),
                    snack.getString("img")
                )
            )
        }

        val snackNames = snacks.map {it.name}

        listSnack = findViewById(R.id.listSnacks)
        val snackArrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            snackNames
        )

        listSnack.adapter = snackArrayAdapter

        listSnack.setOnItemClickListener { _, _, position, _ ->
            startActivity(Intent(this, SnackActivity::class.java)
                .putExtra("snackName", snacks[position].name)
                .putExtra("snackDesc", snacks[position].desc)
                .putExtra("snackImg", snacks[position].img)
            )
        }
    }
}