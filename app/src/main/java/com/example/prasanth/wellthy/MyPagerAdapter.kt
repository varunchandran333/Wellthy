package com.example.prasanth.wellthy

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.prasanth.wellthy.fragments.FirstFragment
import com.example.prasanth.wellthy.fragments.SecondFragment
import com.example.prasanth.wellthy.fragments.ThirdFragment

class MyPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> SecondFragment()
            else -> {
                return ThirdFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 ->  context.getString(R.string.Tab1)
            1 -> context.getString(R.string.Tab2)
            2 -> context.getString(R.string.Tab3)
            else ->{
                return "Third Tab"
            }
        }
    }
}