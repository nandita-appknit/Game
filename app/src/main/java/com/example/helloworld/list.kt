package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.helloworld.list
import kotlinx.android.synthetic.main.activity_list.*

class list : AppCompatActivity() {
    private val list = ArrayList<String>() //declaring list as array
    private lateinit var myadapter : ArrayAdapter<String> //declaring adapter to show views for list_items


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //setting up list dynamically;calling its func
        setuplist()
        //list items events on click
        definations.setOnItemClickListener { _,_,index,_ ->
            list.removeAt(index)
            myadapter.notifyDataSetChanged() //notifying adapter on change of list
        }
    }
    //func to setup list
    fun setuplist() {
        list.add("Hello")
        list.add("World")
        list.add("Kotlin")
        list.add("Android")
        list.add("List")
        list.add("View")
        list.add("List")
        list.add("Words")
        list.add("Fine")
        list.add("Ok")
        list.add("Bye")
        //passing the adapter -> list;thus creating view
        myadapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        definations.adapter = myadapter //passing listview the list through adapter


    }



}
