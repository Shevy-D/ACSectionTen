package com.shevy.acsectionten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
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
            Log.d("posts", "$i")
        }
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, post)

        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            view.visibility = View.GONE
        }
    }
}