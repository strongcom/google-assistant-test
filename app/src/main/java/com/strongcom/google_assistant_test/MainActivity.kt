package com.strongcom.google_assistant_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action = intent?.action
        val data = intent?.data

        Log.d("asdhjfhasdkljfhsa", (action ?: "action 없음"))
        Log.d("asdhjfhasdkljfhsa", "data == "+data.toString())

        Toast.makeText(applicationContext, "$action",Toast.LENGTH_SHORT).show()
    }
}