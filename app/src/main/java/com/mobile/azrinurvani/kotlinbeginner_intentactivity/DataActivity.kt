package com.mobile.azrinurvani.kotlinbeginner_intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        txt_nama.text = intent.getStringExtra("KEY_NAMA")
        txt_umur.text = intent.getStringExtra("KEY_UMUR")

    }
}