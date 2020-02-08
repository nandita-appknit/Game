package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_image.*

class Image : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        //List through XML; list items event on clicking
        lvList.setOnItemClickListener{_, _, index, _ ->
            if(index==0) {
                ivImage.setImageResource(R.drawable.mickey)}  //using images as action
            else if(index==1){
                ivImage.setImageResource(R.drawable.sea)}
            else if(index==2){
                ivImage.setImageResource(R.drawable.rose)}
            else {
                ivImage.setImageResource(R.drawable.kotlin) }
        }
    }
    //calling another activity
    fun NextActivityonclick(view: View) {

        startActivity(Intent(this, list::class.java))
    }
    //radiobutton events
    fun radiobuttonclick(view:View){
        if(view==rb_1) {
             ivImage.setImageResource(R.drawable.mickey)}
        else if(view==rb_2){
            ivImage.setImageResource(R.drawable.sea)}
        else if(view==rb_3){
            ivImage.setImageResource(R.drawable.rose)}

        else {
                ivImage.setImageResource(R.drawable.kotlin)
            }
        }

    }

