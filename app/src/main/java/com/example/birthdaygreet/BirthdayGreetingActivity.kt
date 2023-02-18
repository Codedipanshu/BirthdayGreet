package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthdayGreetingBinding

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(NAME_EXTRA)
        binding.greeting.text = "Happy Birthday\n$name!"
    }
}