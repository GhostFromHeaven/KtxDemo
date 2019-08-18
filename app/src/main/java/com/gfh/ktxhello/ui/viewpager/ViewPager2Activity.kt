package com.gfh.ktxhello.ui.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.gfh.ktxhello.R
import com.google.android.material.tabs.TabLayout

class ViewPager2Activity : AppCompatActivity() {
    private val tabList = listOf("个性推荐", "歌单", "主播电台", "排行榜")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_pager2_activity)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        viewPager.adapter = ViewPager2Adapter()

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        for (name in tabList) {
            tabLayout.addTab(tabLayout.newTab().setText(name).setIcon(R.mipmap.ic_launcher))
        }


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })

        viewPager.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                tabLayout.getTabAt(position)?.select()
                super.onPageSelected(position)
            }
        })
    }
}
