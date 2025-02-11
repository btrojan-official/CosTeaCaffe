package com.example.costeacaffe

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.costeacaffe.databinding.ActivityDrinkBinding
import com.example.costeacaffe.databinding.ActivityLocalBinding
import com.example.costeacaffe.databinding.ActivitySnackBinding
import kotlin.random.Random

class LocalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_local)

        binding = ActivityLocalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val randomColor = Color.rgb(
            Random.nextInt(255),
            Random.nextInt(255),
            Random.nextInt(255)
        )

        var localId = intent.getLongExtra("localId", -1)

        var local = Local.locals[localId.toInt()]

        binding.icon.setImageResource(local.img)
        binding.icon.colorFilter = PorterDuffColorFilter(randomColor, PorterDuff.Mode.SRC_IN)
        binding.title.text = local.name
        binding.description.text = local.desc
    }
}