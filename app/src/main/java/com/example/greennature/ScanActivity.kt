package com.example.greennature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)
        supportActionBar?.hide()
    }
}