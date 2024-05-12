package com.example.lab4

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.os.Handler

class launch : AppCompatActivity() {

    private val DELAY_MS: Long = 6000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_launch)
        // Create a Handler
        Handler().postDelayed({
            // Start the new activity
            val intent = Intent(this@launch, MainActivity::class.java)
            startActivity(intent)

            // Finish the current activity if needed
            finish()
        }, DELAY_MS)
    }

    }
