package com.rizwanamjadnov.githubclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var relativeLayoutButton: Button
    private lateinit var constraintLayoutButton: Button
    private lateinit var linearLayoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        relativeLayoutButton = findViewById(R.id.relative_button)
        constraintLayoutButton = findViewById(R.id.constraint_button)
        linearLayoutButton = findViewById(R.id.linear_button)

        relativeLayoutButton.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }

        constraintLayoutButton.setOnClickListener {
            val intent = Intent(this, ConstraintLayout::class.java)
            startActivity(intent)
        }

        linearLayoutButton.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }

    }
}