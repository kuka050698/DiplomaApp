package com.example.diploma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_profile_page.*

class ProfilePage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentOne(),"General Information")
        adapter.addFragment(FragmentTwo(),"Medical History")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
     class ViewPagerAdapter(manager:FragmentManager):FragmentPagerAdapter(manager){
         private val fragmentList:MutableList<Fragment> = ArrayList()
         private val titleList:MutableList<String> = ArrayList()
         override fun getItem(p0: Int): Fragment {
            return fragmentList[p0]
         }

         override fun getCount(): Int {
            return fragmentList.size
         }
         fun addFragment(fragment:Fragment, title:String){
             fragmentList.add(fragment)
             titleList.add(title)

         }
         override fun getPageTitle(p1:Int):CharSequence?{
             return titleList[p1]
         }

     }
}
