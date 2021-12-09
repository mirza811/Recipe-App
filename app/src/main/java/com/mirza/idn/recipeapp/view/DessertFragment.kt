package com.mirza.idn.recipeapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.mirza.idn.recipeapp.data.DataRecipes
import com.mirza.idn.recipeapp.data.Recipes
import com.mirza.idn.recipeapp.adapter.RecipesAdapter
import com.mirza.idn.recipeapp.databinding.FragmentDessertBinding


class DessertFragment : Fragment() {
    private lateinit var dessertBinding: FragmentDessertBinding
    private var list: ArrayList<Recipes> = arrayListOf()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dessertBinding = FragmentDessertBinding.inflate(inflater, container, false)
        return dessertBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataRecipes.dataDessert)
        dessertBinding.rvDessert.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            val recipesAdapter = RecipesAdapter(list)
            adapter = recipesAdapter
        }
    }

}