package com.shevy.acsectionten

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shevy.acsectionten.databinding.ActivityRecipeBinding

class RecipeActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = binding.titleRecipeTextView
        val recipe = binding.recipeTextView

        val intent = intent
        if (intent != null) {
            //ivPizza.setImageResource(intent.getIntExtra("image", 0))
            title.text = intent.getStringExtra("title")
            Log.d("RecipeActivity", "${intent.getStringExtra("title")}")
            recipe.text = intent.getStringExtra("recipe")
            Log.d("RecipeActivity", "${intent.getStringExtra("recipe")}")
        }
    }
}