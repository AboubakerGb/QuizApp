package com.aboubakergb.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button.setOnClickListener {
            if(et_name.text.toString().isEmpty()){
                //make Toast when the et name is empty
                Toast.makeText(this,"أدخل اسمك من فضلك", Toast.LENGTH_SHORT).show()
            }else{
                // Move to the next Activity
                val intent =Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}