package com.example.prasanth.wellthy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar


class MainActivity : AppCompatActivity() {
    private var toolbar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: CustomViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById(R.id.viewpager)
        viewPager!!.setEnableSwipe(false)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager,this)
        viewPager!!.adapter = fragmentAdapter

        tabLayout = findViewById(R.id.tabs)

        tabLayout!!.setupWithViewPager(viewPager)
    }



}
