package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.helloworld.list
import kotlinx.android.synthetic.main.activity_list.*

class list : AppCompatActivity() {
    private val list = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setuplist()
        /*definations.setOnItemClickListener{_,_,index,_->
           list.removeAt(index)
           // myadapter.notifyDataSetChanged()

        }*/
    }
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
         val myadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)


        definations.adapter = myadapter


    }



}
