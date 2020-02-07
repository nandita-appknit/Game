package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.text.style.ClickableSpan
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import kotlin.math.nextTowards
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var points = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //calling the random number function
        pickrandomnumbers()}
        fun NextActivityonclick(view: View) {

            startActivity(Intent(this, Guess::class.java))
        }

    //event on left button click
    fun leftbuttonclick(view: View) {
      checkIfCorrect(isLeft = true)
    }

    //event on right button click
    fun rightbuttonclick(view: View) {
        checkIfCorrect(isLeft = false)
    }
    private fun checkIfCorrect(isLeft:Boolean){
        val leftnum = btnleftbutton.text.toString().toInt()
        val rightnum = btnrightbutton.text.toString().toInt()

        if (isLeft && leftnum > rightnum||!isLeft && leftnum<rightnum)
        {
            points++
            Toast.makeText(this,"Point Earned",Toast.LENGTH_SHORT).show()

        } else {
            points--
            Toast.makeText(this,"Lose",Toast.LENGTH_SHORT).show()

        }
        tvPoints.text = "Points: $points"
        pickrandomnumbers()
    }

    //generating random numbers on l/r buttons.
    private fun pickrandomnumbers() {
        val num1 = Random.nextInt(20)
        var num2 = num1
        while (num2 == num1) //loop to check if same number appears.
        {
            num2 = Random.nextInt(20)
        }
        btnleftbutton.text = "$num1"
        btnrightbutton.text = "$num2"
    }
}
