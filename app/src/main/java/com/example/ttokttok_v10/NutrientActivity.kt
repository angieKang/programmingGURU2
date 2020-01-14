package com.example.ttokttok_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_nutrient.*

class NutrientActivity : AppCompatActivity() {

    private lateinit  var adapter: NutrientAdapter

    private val nutrient = arrayListOf<Nutrient>(
        Nutrient("유산균"),
        Nutrient("Persian Cat"),
        Nutrient("Siamese Cat"),
        Nutrient("Maine Coon"),
        Nutrient("Ragdoll"),
        Nutrient("Sphynx Cat"),
        Nutrient("Abyssinian")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient)

        // 'BACK' 버튼 클릭 -> MainActivity로 이동
        btn_back6.setOnClickListener {
            val back6Intent = Intent(this, MainActivity::class.java)
            startActivity(back6Intent)
        }

        rec_nutrient.layoutManager = LinearLayoutManager(this)
        adapter = NutrientAdapter(this) {
            val nutrientnameIntent = Intent(this, ProductActivity::class.java)
            startActivity(nutrientnameIntent)

        }
        adapter.setItems(nutrient)
        rec_nutrient.adapter = adapter
    }

}