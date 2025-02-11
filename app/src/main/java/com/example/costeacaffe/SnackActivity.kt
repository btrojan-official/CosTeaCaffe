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
import com.example.costeacaffe.databinding.ActivitySnackBinding
import kotlin.random.Random

class SnackActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySnackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack)

        binding = ActivitySnackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var snackName = intent.getStringExtra("snackName")
        var snackDesc = intent.getStringExtra("snackDesc")
        var snackImg = intent.getStringExtra("snackImg")

        val randomColor = Color.rgb(
            Random.nextInt(255),
            Random.nextInt(255),
            Random.nextInt(255)
        )

        binding.icon.setImageResource(R.drawable.snack)
        // Line below is responsible for random color change
        binding.icon.colorFilter = PorterDuffColorFilter(randomColor, PorterDuff.Mode.SRC_IN)
        binding.title.text = snackName
        binding.description.text = snackDesc
    }
}