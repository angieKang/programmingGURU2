package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_brand.*

class BrandActivity : AppCompatActivity() {

    private lateinit  var adapter: BrandAdapter

    private val petList = arrayListOf<Brand>(
        Brand("한국인삼공사", "Male"),
        Brand("Persian Cat", "Male"),
        Brand("Siamese Cat", "Female"),
        Brand("Maine Coon", "Male"),
        Brand("Ragdoll", "Male"),
        Brand("Sphynx Cat", "Male"),
        Brand("Abyssinian", "Female")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)

        // 'BACK' 버튼 클릭 -> MainActivity로 이동
        btn_back4.setOnClickListener {
            val back4Intent = Intent(this, MainActivity::class.java)
            startActivity(back4Intent)
        }

        rec_brand.layoutManager = LinearLayoutManager(this)
        adapter = BrandAdapter(this) {
            val brandnameIntent = Intent(this, ProductActivity::class.java)
            startActivity(brandnameIntent)

        }
        adapter.setItems(petList)
        rec_brand.adapter = adapter

    }
}
