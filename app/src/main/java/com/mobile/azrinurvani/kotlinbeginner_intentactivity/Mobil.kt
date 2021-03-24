package com.mobile.azrinurvani.kotlinbeginner_intentactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mobil(
    val merk:String,
    val kondisi: String,
    val tahun:Int,
    val bahanBakar:String,
    val platNo : String
):Parcelable