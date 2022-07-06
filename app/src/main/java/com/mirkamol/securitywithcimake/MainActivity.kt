package com.mirkamol.securitywithcimake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    init {
        System.loadLibrary("native-lib")
    }
    private external fun stringFromJNI(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate: ${stringFromJNI()}")
    }
}