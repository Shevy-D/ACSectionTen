package com.shevy.acsectionten

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shevy.acsectionten.databinding.PizzaRecipeItemBinding

class PizzaRecipeAdapter(private val arrayList: ArrayList<PizzaRecipeItem>): RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder>() {

    //private val arrayList = ArrayList<RecyclerViewItem>()

    class PizzaRecipeViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = PizzaRecipeItemBinding.bind(item)

        val imageView = binding.pizzaImageView
        val title = binding.titleTextView
        val description = binding.descriptioTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaRecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pizza_recipe_item, parent, false)
        return PizzaRecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: PizzaRecipeViewHolder, position: Int) {
        holder.imageView.setImageResource(arrayList[position].imageResource)
        holder.title.text = arrayList[position].title
        holder.description.text = arrayList[position].description
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}