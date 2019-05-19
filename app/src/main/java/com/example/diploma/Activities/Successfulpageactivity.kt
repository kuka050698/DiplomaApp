package com.example.diploma.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.diploma.ID
import com.example.diploma.R
import com.example.diploma.Singleton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_successfulpageactivity.*

class Successfulpageactivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successfulpageactivity)
        database = FirebaseDatabase.getInstance().reference
        database.child("mode").setValue("0")

        finger_id.text = Singleton.globalID
        start_button.setOnClickListener{
            startActivity(Intent(this, MainPage::class.java))
        }
    }
}
