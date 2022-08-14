package com.shevy.acsectionten

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shevy.acsectionten.databinding.PizzaRecipeItemBinding

class PizzaRecipeAdapter(
    private val pizzaRecipeItems: ArrayList<PizzaRecipeItem>, context: Context
) : RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder>() {
    val context = context

    inner class PizzaRecipeViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = PizzaRecipeItemBinding.bind(item)

        val imageView = binding.pizzaImageView
        val title = binding.titleTextView
        val description = binding.descriptioTextView

        init {
            item.setOnClickListener {
                val pizzaRecipeItem = pizzaRecipeItems[adapterPosition]
                val intent = Intent(context, RecipeActivity::class.java)
                intent.apply {
                    putExtra("imageResource", pizzaRecipeItem.imageResource)
                    putExtra("title", pizzaRecipeItem.title)
                    putExtra("description", pizzaRecipeItem.description)
                    putExtra("recipe", pizzaRecipeItem.recipe)
                }
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaRecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pizza_recipe_item, parent, false)
        return PizzaRecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: PizzaRecipeViewHolder, position: Int) {
        holder.imageView.setImageResource(pizzaRecipeItems[position].imageResource)
        holder.title.text = pizzaRecipeItems[position].title
        holder.description.text = pizzaRecipeItems[position].description
    }

    override fun getItemCount(): Int = pizzaRecipeItems.size
}