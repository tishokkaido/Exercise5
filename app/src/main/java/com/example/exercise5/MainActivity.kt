package com.example.exercise5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.pager)
        val adapter = PagerAdapter(supportFragmentManager)
        pager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tab)
        tabLayout.setupWithViewPager(pager)
    }
}