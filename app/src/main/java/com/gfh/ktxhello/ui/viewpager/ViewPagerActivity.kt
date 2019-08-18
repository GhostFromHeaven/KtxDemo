package com.gfh.ktxhello.ui.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.gfh.ktxhello.R
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {
    private val tabList = listOf("个性推荐", "歌单", "主播电台", "排行榜", "动态", "听歌识曲", "好友", "附近")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_pager_activity)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
//        for (name in tabList) {
//            tabLayout.addTab(tabLayout.newTab().setText(name).setIcon(R.mipmap.ic_launcher))
//        }

        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val colorList = listOf(R.color.colorPrimary, R.color.colorPrimaryDark, R.color.colorAccent)
        val fragmentList = tabList.mapIndexed { index, name ->
            ViewPagerTabFragment.createInstance(name, colorList[index % colorList.size])
        }

        viewPager.adapter = ViewPagerAdapter(fragmentList, tabList, supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}
