package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_function.*

class FunctionActivity : AppCompatActivity() {

    private val productList = arrayListOf(
        Product("관절건강", 7, 574770, R.drawable.medicine_icon),
        Product("영양보충",19, 297580, R.drawable.medicine_icon),
        Product("피부건강",16, 144500, R.drawable.medicine_icon),
        Product("피로개선",16, 170150, R.drawable.medicine_icon)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        val layoutManager = GridLayoutManager(this, 4)
        rec_function.layoutManager = layoutManager

        var adapter = ProductAdapter() {
            Toast.makeText(this,
                "선택된제품 : ${it.name}",
                Toast.LENGTH_SHORT).show()
        }
        adapter.setItems(productList)
        rec_function.adapter = adapter

        // 'BACK' 버튼 클릭 -> MainActivity로 이동
        btn_back5.setOnClickListener {
            val back5Intent = Intent(this, MainActivity::class.java)
            startActivity(back5Intent)
        }
    }
}
