package com.yhkim.kt_20191215_liftcycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {
    }

    override fun setValues() {
    }

}
