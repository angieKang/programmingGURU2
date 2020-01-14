package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // '로그인' 버튼 클릭 -> MainActivity로 돌아감
        btn_login.setOnClickListener {
            // 메인 화면으로 돌아감
        }

        // '회원가입' 버튼 클릭 -> JoinActivity로 이동
        btn_join.setOnClickListener {
            val joinIntent = Intent(this, JoinActivity::class.java)
            startActivity(joinIntent)
        }

        // 'BACK' 버튼 클릭 -> MainActivity로 이동
        btn_back1.setOnClickListener {
            val back1Intent = Intent(this, MainActivity::class.java)
            startActivity(back1Intent)
        }
    }
}
