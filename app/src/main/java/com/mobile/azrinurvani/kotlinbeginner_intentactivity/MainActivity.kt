package com.mobile.azrinurvani.kotlinbeginner_intentactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move_activity.setOnClickListener {
            val intent = Intent(this@MainActivity,MoveActivity::class.java)
            startActivity(intent)
        }

        btn_data_activity.setOnClickListener {
            val nama = edt_nama.text.toString()
            val umur = edt_umur.text.toString()

            val intent = Intent(this@MainActivity,DataActivity::class.java)
            intent.putExtra("KEY_NAMA",nama)
            intent.putExtra("KEY_UMUR",umur)
            startActivity(intent)
        }

        btn_object_activity.setOnClickListener {
            val merk = edt_merk.text.toString()
            var kondisi = ""
            if (rb_baru.isChecked){
                kondisi = "Baru"
            }else if (rb_bekas.isChecked){
                kondisi = "Bekas"
            }
            val tahun = edt_tahun.text.toString().toInt()
            val bahanBakar = edt_bahan_bakar.text.toString()
            val platNo = edt_plat_nomor.text.toString()

            val mobil = Mobil(merk,kondisi,tahun, bahanBakar,platNo)
            val intent = Intent(this@MainActivity,ObjectActivity::class.java)
            intent.putExtra("DATA_MOBIL",mobil)
            startActivity(intent)

        }

        btn_result_activity.setOnClickListener {
            val intent = Intent(this@MainActivity,ResultActivity::class.java)
            startActivityForResult(intent,100)
        }

        btn_dial_phone.setOnClickListener {
            val phoneNumber = "0876767667676"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }

        btn_sms.setOnClickListener {
            val phoneNumber = "085454545454"
            val textSms = "Hai, ini adalah pesan dari intent implisit... :)"

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:$phoneNumber")
            intent.putExtra("sms_body",textSms)
            startActivity(intent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==100){
            if (resultCode==200){
                val dataFromResultActivity = data?.getStringExtra("DATA_RESULT")
                txt_result.text = dataFromResultActivity
            }
        }
    }
}