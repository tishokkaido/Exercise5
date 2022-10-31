package com.example.exercise5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 2 // ページ数分の固定値を設定

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                FavoriteFragment()
            }
            1 -> {
                LatestFragment()
            }
            else -> {
                FavoriteFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> {
                "おすすめ"
            }
            else -> {
                "最新刊"
            }
        }
    }
}