package com.aboubakergb.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // get the information from the intent
        val currectQuestion =intent.getIntExtra(Constants.CORRECT_ANSWER,0)
        val totalQuestion =intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val userName=intent.getStringExtra(Constants.USER_NAME)

        tv_name.text=userName
        tv_score.text="نتيجتك هي $currectQuestion من $totalQuestion"

        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}