package com.strongcom.google_assistant_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

private const val GET_THING = "name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action = intent?.action
        val data = intent?.data
        val action2 = intent?.extras?.getString(GET_THING)

        Log.d("asdhjfhasdkljfhsa", "get thing "+(action2 ?: "문자"))
//        Log.d("asdhjfhasdkljfhsa", (action ?: "action 없음"))
//        Log.d("asdhjfhasdkljfhsa", "data == " + data.toString())

    }
}