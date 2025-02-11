package com.example.costeacaffe

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LocalCategoryActivity : AppCompatActivity() {

    private lateinit var listLocals : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_category)

        listLocals = findViewById(R.id.listLocals)
        val localArrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            Local.locals
        )

        listLocals.adapter = localArrayAdapter

        listLocals.setOnItemClickListener { _, _, _, id ->
            startActivity(Intent(this, LocalActivity::class.java).putExtra("localId", id))
        }
    }
}