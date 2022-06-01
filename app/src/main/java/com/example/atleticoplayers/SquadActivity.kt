package com.example.atleticoplayers

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SquadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squad)

        //back to MainActivity
        val back_btn: ImageButton = findViewById(R.id.back_btn)
        back_btn.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //click sub_btn
        val sub_btn: ImageButton = findViewById(R.id.sub_btn)
        sub_btn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }
    }
}