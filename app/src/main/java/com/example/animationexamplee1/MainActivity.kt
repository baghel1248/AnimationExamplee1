package com.example.animationexamplee1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var onbutton: Button =findViewById(R.id.OnButton)
        var offbutton: Button =findViewById(R.id.OffButton)
        var onimage:ImageView=findViewById(R.id.OffImage)
        var offimage:ImageView=findViewById(R.id.OnImage)
            onbutton.setOnClickListener {
                offimage.visibility = VISIBLE
                onimage.visibility=GONE
                offbutton.visibility= VISIBLE
                onbutton.visibility= GONE

            }
        offbutton.setOnClickListener {
            onimage.visibility = VISIBLE
            offimage.visibility= GONE
            onbutton.visibility=VISIBLE
            offbutton.visibility= GONE

        }

     }
    }
