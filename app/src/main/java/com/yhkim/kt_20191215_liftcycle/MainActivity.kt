package com.yhkim.kt_20191215_liftcycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var lastBackButtonTime = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("생명주기", "onCreate 실행")
    }

    override fun onBackPressed() {
        val currentTime = System.currentTimeMillis()

        Toast.makeText(mContext, "한번 더 뒤로 버튼을 누르면 종료됩나다", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Log.d("생명주기", "onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("생명주기", "onPause 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("생명주기", "onDestroy 실행")
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
