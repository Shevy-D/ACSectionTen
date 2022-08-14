package com.shevy.acsectionten

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.shevy.acsectionten.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.listView

        val post: ArrayList<String> = ArrayList()
        for (i in 1..20) {
            post.add("Post $i")
            //Log.d("posts", "$i")
        }

        val colors: ArrayList<String> = arrayListOf("Red", "Orange", "Yellow", "Green", "Blue", "Blue", "Violet")

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors)

        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            //view.visibility = View.GONE
            val color = when (i) {
                0 -> "Красный"
                1 -> "Оранжевый"
                2 -> "Желтый"
                3 -> "Зеленый"
                4 -> "Голубой"
                5 -> "Синий"
                else -> "Фиолетовый"
            }
            Toast.makeText(this, color, Toast.LENGTH_SHORT).show()
        }
    }
}