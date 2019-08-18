package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.gfh.ktxhello.R


class ActionBarSwipeTabActivity : AppCompatActivity(), ActionBar.TabListener {
    lateinit var viewPager: ViewPager
    lateinit var pagerAdapter: ActionBarSwipePagerAdapter
    lateinit var actionBar: ActionBar

    private val tabs = arrayOf("Missed Calls", "Dialled", "Received")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_swipe_tab)

        viewPager = findViewById(R.id.pager)
        pagerAdapter = ActionBarSwipePagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter

        actionBar = supportActionBar ?: return
        actionBar.navigationMode = ActionBar.NAVIGATION_MODE_TABS

        for (name in tabs) {
            actionBar.addTab(actionBar.newTab().setText(name).setTabListener(this))
        }

        viewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                actionBar.setSelectedNavigationItem(position)
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })
    }

    override fun onTabSelected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        viewPager.currentItem = tab.position
    }

    override fun onTabUnselected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        //
    }

    override fun onTabReselected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        //
    }
}
