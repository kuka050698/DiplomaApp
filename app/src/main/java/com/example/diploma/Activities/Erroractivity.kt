package com.example.diploma.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.diploma.R
import kotlinx.android.synthetic.main.activity_erroractivity.*




class Erroractivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.diploma.R.layout.activity_erroractivity)
        contact_button.setOnClickListener{
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "87075131998"))
            startActivity(intent)

        }
    }
}
