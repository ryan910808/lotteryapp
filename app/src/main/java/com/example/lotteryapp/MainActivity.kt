package com.example.lotteryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameInput = findViewById<EditText>(R.id.userNameInput)
        val startButton = findViewById<Button>(R.id.startLotteryButton)

        startButton.setOnClickListener {
            val name = userNameInput.text.toString()

            // 模擬抽籤結果（隨機選一個）
            val results = listOf("大吉", "中吉", "小吉", "凶", "大凶")
            val randomResult = results.random()

            // 建立 Intent 跳轉到 ResultActivity
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("result", randomResult)
            startActivity(intent)
        }
    }
}
