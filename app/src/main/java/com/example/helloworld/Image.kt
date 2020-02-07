package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_image.*

class Image : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
    }
    fun radiobuttonclick(view:View){
        if (view==rb_1){
            ivImage.setImageResource(R.drawable.mickey)
        }
        else if(view==rb_2){
            ivImage.setImageResource(R.drawable.sea)
        }
        else if(view==rb_3){
            ivImage.setImageResource(R.drawable.rose)
        }
        else {
            ivImage.setImageResource(R.drawable.kotlin)
        }
    }
}
