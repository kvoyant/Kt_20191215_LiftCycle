package com.yhkim.kt_20191215_liftcycle

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setupEvents()
        setValues()
    }

    override fun onBackPressed() {
//        super.onBackPressed() //주석하면 뒤로가기 안먹힘

        val alert = AlertDialog.Builder(mContext)
        alert.setTitle("게시글 작성 중지 확인")
        alert.setTitle("정말 글 작성을 중단 하시겠습니까? 작성하신 내용은 모두 삭제 됩니다.")
        alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        alert.setNegativeButton("취소", null)
        alert.show()

    }
    override fun setupEvents() {
    }

    override fun setValues() {
    }

}
