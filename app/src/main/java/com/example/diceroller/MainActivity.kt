package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn_roller)


        btn.setOnClickListener {
            //image.setImageResource(R.drawable.dice_2)
            diceRoll()
        }
    }
    fun diceRoll(){
        var image=findViewById<ImageView>(R.id.dice_image)
        var randomNo= 1..6
        var result=randomNo.random()
        when(result){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)

        }
    }


}



