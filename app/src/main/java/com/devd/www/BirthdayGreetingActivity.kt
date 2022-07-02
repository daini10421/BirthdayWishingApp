 package com.devd.www

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

 class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name: String? =intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text="Happy Birthday\n$name!"
    }
}