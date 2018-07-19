package com.example.prasanth.wellthy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.widget.Toolbar
import android.support.v4.app.FragmentPagerAdapter
import com.example.prasanth.wellthy.fragments.SecondFragment
import com.example.prasanth.wellthy.fragments.FirstFragment
import com.example.prasanth.wellthy.fragments.ThirdFragment


class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById(R.id.viewpager)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager,this)
        viewPager!!.adapter = fragmentAdapter

        tabLayout = findViewById(R.id.tabs)
        tabLayout!!.setupWithViewPager(viewPager)
    }



}
