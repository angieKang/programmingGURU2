package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_join.*
import kotlinx.android.synthetic.main.activity_login.*

class JoinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        // 'BACK' 버튼 클릭 -> LoginActivity로 이동
        btn_back2.setOnClickListener {
            val back2Intent = Intent(this, LoginActivity::class.java)
            startActivity(back2Intent)
        }

    }
}
