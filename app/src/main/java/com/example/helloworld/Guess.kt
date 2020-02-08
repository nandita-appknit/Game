package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_guess.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class Guess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess)
        //button event to check if number is correct!
        bnCheck.setOnClickListener {
            numcheck()  //calling the func
        }
    }
    //next activity
    fun NextActivityonclick(view: View) {

        startActivity(Intent(this, Image::class.java))
    }

    //generating random number once
    var num1 = Random.nextInt(100)
    //func to check corresponding conditions
    fun numcheck(){
        val et = etGuess.text.toString().toInt()  //fetching the edittext text and parsing it into int

        if(et==num1){
            Toast.makeText(this,"Your Guess is RIGHT", Toast.LENGTH_LONG).show() //to generate small pop-up
            tvHint.text="Hint : RIGHT"

        }
        else if (et>num1)
        {
            Toast.makeText(this,"Try Again", Toast.LENGTH_SHORT).show()
            tvHint.text="Hint : Number is Lower!"
        }
        else{
            Toast.makeText(this,"Try Again", Toast.LENGTH_SHORT).show()
            tvHint.text="Hint : Number is Higher!"
        }
    }

}
