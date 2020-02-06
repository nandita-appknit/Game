package com.example.helloworld

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
        bnCheck.setOnClickListener {
            numcheck()
        }
    }

    var num1 = Random.nextInt(100)

    fun numcheck(){
        val et = etGuess.text.toString().toInt()

        if(et==num1){
            Toast.makeText(this,"Your Guess is RIGHT", Toast.LENGTH_LONG).show()
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
