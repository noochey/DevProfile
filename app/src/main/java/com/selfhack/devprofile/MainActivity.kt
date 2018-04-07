package com.selfhack.devprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rouded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rouded.cornerRadius = 15f
        logo.setImageDrawable(rouded)
    }
}
