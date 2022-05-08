package com.leedaejin.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText : EditText = findViewById<EditText>(R.id.heightEditText)
        val weightEditText : EditText = findViewById(R.id.WeightEditText)
        val resultButton:Button = findViewById<Button>(R.id.resultButton)


        resultButton.setOnClickListener {
            //예외처리 먼저 하기!
            if(heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this,"빈 값이 있습니다.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }

            //이 아래로는 절대 빈 값이 올 수 없음.
            val height = heightEditText.text.toString().toInt()  //값 가져오기
            val weight = weightEditText.text.toString().toInt()

            val intent = Intent(this,ResultActivity::class.java) //값 넘겨주기


            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)

        }







    }
}