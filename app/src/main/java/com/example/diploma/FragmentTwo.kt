package com.example.diploma


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_mainpage.*
import kotlinx.android.synthetic.main.activity_profile_page.*
import kotlinx.android.synthetic.main.fragment_fragment_one.*

class FragmentTwo : Fragment() {
    private lateinit var url_kuanysh:String
    private lateinit var url_bakdaulet:String
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tab_title.text = "Medical History"
        url_kuanysh = "https://firebasestorage.googleapis.com/v0/b/diploma-65854.appspot.com/o/circlekuanysh.png?alt=media&token=5e0aa0e1-887e-466e-bf5c-a1bbf5636dcd"
        url_bakdaulet = "https://firebasestorage.googleapis.com/v0/b/diploma-65854.appspot.com/o/bakdaulet_circle.gif?alt=media&token=f74335a9-13f6-4b3c-88b6-85c6a39bbc0f"
        if(Singleton.globalID=="1kuanysh"){
            Glide.with(this).load(url_kuanysh).into(profile_image)
        }
        else if(Singleton.globalID == "2Bakdaulet"){
            Glide.with(this).load(url_bakdaulet).into(profile_image)
        }
    }


}
