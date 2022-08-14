package com.shevy.acsectionten

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shevy.acsectionten.databinding.RecyclerViewItemBinding

class RecyclerViewAdapter(private val arrayList: ArrayList<RecyclerViewItem>): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    //private val arrayList = ArrayList<RecyclerViewItem>()

    class RecyclerViewViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = RecyclerViewItemBinding.bind(item)

        val imageView = binding.imageView
        val textView1 = binding.textView1
        val textView2 = binding.textView2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return RecyclerViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.imageView.setImageResource(arrayList[position].imageResource)
        holder.textView1.text = arrayList[position].text1
        holder.textView2.text = arrayList[position].text2
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}