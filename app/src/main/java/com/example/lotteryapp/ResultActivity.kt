package com.example.lotteryapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 取得傳過來的資料
        val name = intent.getStringExtra("name") ?: "無名"
        val result = intent.getStringExtra("result") ?: "無結果"

        // 顯示結果
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        nameTextView.text = "你好，$name！"
        resultTextView.text = "你的抽籤結果是：$result"
    }
}
