package com.gfh.ktxhello.ui.actionbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gfh.ktxhello.R

class ActionBarSwipePagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> ActionBarSwipeTabFragment.createInstance("tab1", R.color.colorPrimary)
            1 -> ActionBarSwipeTabFragment.createInstance("tab1", R.color.colorPrimaryDark)
            else -> ActionBarSwipeTabFragment.createInstance("tab1", R.color.colorAccent)
        }
    }

    override fun getCount(): Int {
        return 3
    }

}