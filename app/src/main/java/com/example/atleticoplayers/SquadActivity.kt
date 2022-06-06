package com.example.atleticoplayers

import android.app.Activity
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import java.text.FieldPosition

class SquadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squad)

        //access the items of the list
        val formations = resources.getStringArray(R.array.formations)

        //back to MainActivity
        val back_btn: ImageButton = findViewById(R.id.back_btn)
        back_btn.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        //click sub_btn
        val sub_btn: ImageButton = findViewById(R.id.sub_btn)
        sub_btn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        //spinner choose formation
        val spinner = findViewById<Spinner>(R.id.formation_spinner)
        if (spinner != null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, formations)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long){
                        when(position){
                            0 -> {
                                supportFragmentManager.beginTransaction()
                                    .replace(R.id.fom_fra, F3142Fragment()).commit()
                            }
                            1 -> {
                                supportFragmentManager.beginTransaction()
                                    .replace(R.id.fom_fra, F442Fragment()).commit()
                            }
                            2 -> {
                                supportFragmentManager.beginTransaction()
                                    .replace(R.id.fom_fra, F532Fragment()).commit()
                            }
                            3 -> {
                                supportFragmentManager.beginTransaction()
                                    .replace(R.id.fom_fra, F541Fragment()).commit()
                            }
                        }
                    }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
                }
        }
    }

}