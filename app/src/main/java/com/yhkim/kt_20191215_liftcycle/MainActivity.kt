package com.yhkim.kt_20191215_liftcycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("생명주기", "onCreate 실행")
    }

    override fun onResume() {
        super.onResume()

        Log.d("생명주기", "onResume 실행")

    }

    override fun setupEvents() {
        callActivityBtn.setOnClickListener {
            val intent = Intent(mContext, SecondActivity::class.java)
            startActivity(intent)
        }

    }

    override fun setValues() {
    }

}
