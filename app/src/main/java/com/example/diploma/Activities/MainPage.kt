package com.example.diploma.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.diploma.ProfilePage
import com.example.diploma.R
import com.example.diploma.Singleton
import kotlinx.android.synthetic.main.activity_mainpage.*

class MainPage : AppCompatActivity() {
    private lateinit var url_kuanysh:String
    private lateinit var url_bakdaulet:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)
//        url_kuanysh = "https://firebasestorage.googleapis.com/v0/b/diploma-65854.appspot.com/o/circlekuanysh.png?alt=media&token=5e0aa0e1-887e-466e-bf5c-a1bbf5636dcd"
//        url_bakdaulet = "https://firebasestorage.googleapis.com/v0/b/diploma-65854.appspot.com/o/bakdaulet_circle.gif?alt=media&token=f74335a9-13f6-4b3c-88b6-85c6a39bbc0f"
        name_profile.text = Singleton.globalUser?.Name
        blood_group_number.text = Singleton.globalUser?.Allergies
//        if(Singleton.globalID=="1kuanysh"){
//            Glide.with(this).load(url_kuanysh).into(profile_image)
//        }
//        else if(Singleton.globalID == "2Bakdaulet"){
//            Glide.with(this).load(url_bakdaulet).into(profile_image)
//        }
        more_button.setOnClickListener{
            val intent = Intent(this@MainPage,ProfilePage::class.java)
            startActivity(intent)
        }
    }
}
