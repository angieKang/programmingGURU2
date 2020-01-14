package com.example.ttokttok_v10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_item.view.imageView1
import kotlinx.android.synthetic.main.product_item.view.textView2
import java.util.*


class ProductAdapter (val itemCheck: (Product) -> Unit)
    : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    private var items = ArrayList<Product>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itemView: View = inflater.inflate(R.layout.product_item, viewGroup, false)
        return ViewHolder(itemView, itemCheck)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item: Product = items[position]
        viewHolder.setItem(item)
    }

    override fun getItemCount(): Int {
        return items.count()
    }


    fun setItems(items: ArrayList<Product>) {
        this.items = items
    }

    inner class ViewHolder(itemView: View, itemCheck: (Product) -> Unit)
        : RecyclerView.ViewHolder(itemView) {
        fun setItem(item: Product) {
            itemView.textView2.text = item.name
            itemView.imageView1.setImageResource(item.imageRes)
            itemView.setOnClickListener { itemCheck(item) }
        }
    }
}