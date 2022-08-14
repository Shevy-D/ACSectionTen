package com.shevy.acsectionten

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shevy.acsectionten.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    //Delete it
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>
    lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*
        val recyclerViewItems: ArrayList<RecyclerViewItem> = ArrayList()
        recyclerViewItems.add(RecyclerViewItem(R.drawable.ic_launcher_background, "Happy", "Life is fun!"))
        recyclerViewItems.add(RecyclerViewItem(R.drawable.ic_launcher_background, "Sad", "Life is sad!"))
        recyclerViewItems.add(RecyclerViewItem(R.drawable.ic_launcher_background, "Neutral", "Life is life!"))
*/

/*        binding.recyclerView.apply {
            setHasFixedSize(true)
            adapter = RecyclerViewAdapter(recyclerViewItems)
            layoutManager = LinearLayoutManager(context)
        }*/
    }
}