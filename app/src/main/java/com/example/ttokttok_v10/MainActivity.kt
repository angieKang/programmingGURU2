package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_brand.setOnClickListener {
            val brandIntent = Intent(this, BrandActivity::class.java)
            startActivity(brandIntent)
        }

        /* 헤더 */

        // '북마크' 버튼 클릭 -> SelectActivity로 이동
        btn_bookmark.setOnClickListener {
            val bookmarkIntent = Intent(this, SelectActivity::class.java)
            startActivity(bookmarkIntent)
        }

        // '로그인' 버튼 클릭 -> LoginActivity로 이동
        btn_login.setOnClickListener {
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }

        /* 검색창 */

        // '검색' 버튼 클릭 -> SelectActivity로 이동
        btn_search.setOnClickListener {
            val searchIntent = Intent(this, SelectActivity::class.java)
            startActivity(searchIntent)
        }

        /* 주요 버튼 3개 */

        // '브랜드별' 버튼 클릭 -> BrandActivity로 이동
        btn_brand.setOnClickListener {
            val brandIntent = Intent(this, BrandActivity::class.java)
            startActivity(brandIntent)
        }

        // '기능별' 버튼 클릭 -> FunctionActivity로 이동
        btn_function.setOnClickListener {
            val functionIntent = Intent(this, FunctionActivity::class.java)
            startActivity(functionIntent)
        }

        // '영양소별' 버튼 클릭 -> NutrientActivity로 이동
        btn_nutrient.setOnClickListener {
            val nutrientIntent = Intent(this, NutrientActivity::class.java)
            startActivity(nutrientIntent)
        }
    }
}
