package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener {
            checkAnswer()
        }
    }
    private fun checkAnswer() {
        var correctAnswers = 0

        val answer1 = binding.etAnswer1.text.toString()
        val answer2 = binding.etAnswer2.text.toString()
        val answer3 = binding.etAnswer3.text.toString()
        val answer4 = binding.etAnswer4.text.toString()

        if (answer1 == getString(R.string.tvT)) {
            correctAnswers += 1
        }

        if (answer2 == getString(R.string.tvF)) {
            correctAnswers += 1
        }

        if (answer3 == getString(R.string.tvF)) {
            correctAnswers += 1
        }

        if (answer4 == getString(R.string.tvT)) {
            correctAnswers += 1
        }

        Toast.makeText(this, "You have $correctAnswers Correct Answers",Toast.LENGTH_LONG).show()

    }
}