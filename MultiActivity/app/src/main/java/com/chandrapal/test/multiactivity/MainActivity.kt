package com.chandrapal.test.multiactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun welcome(view: View) {
        if (name.text.toString() == "") {
            Toast.makeText(applicationContext, "Please enter your name", Toast.LENGTH_LONG).show()
        }
        else {
            var intent = Intent(applicationContext, WelcomeActivity::class.java)
            intent.putExtra("name", name.text.toString())
            startActivity(intent)
        }
    }
}
