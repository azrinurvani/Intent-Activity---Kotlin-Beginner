package com.mobile.azrinurvani.kotlinbeginner_intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_object.*

class ObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object)

        val data = intent.getParcelableExtra<Mobil>("DATA_MOBIL")

        txt_merk.text = data?.merk
        txt_kondisi.text = data?.kondisi
        txt_tahun.text = data?.tahun.toString()
        txt_bahan_bakar.text = data?.bahanBakar
        txt_plat_nomor.text = data?.platNo

    }
}