package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.Restaurant
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */
        adapter.items = listOf(Restaurant("KFC", "Udyogvihar", "Chicken"),
            Restaurant("BurgerKing", "ShushantLok", "Burgers"),
            Restaurant("Pizza Hut", "CyberHub", "Pizzas"),
            Restaurant("Burma Burma", "Cybercity", "Bahut Mehenga"),
            Restaurant("Jhingostan", "Mumbai", "Gully Boy"),
            Restaurant("Berco's", "Rohini", "Chineese")

        )
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}