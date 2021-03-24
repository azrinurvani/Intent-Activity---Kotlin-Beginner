package com.mobile.azrinurvani.kotlinbeginner_intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        btn_send_to_main.setOnClickListener {
            val dataString = edt_result.text.toString()
            val intent = Intent()
            intent.putExtra("DATA_RESULT",dataString)
            setResult(200,intent)
            finish()
        }
    }
}