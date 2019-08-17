package com.gfh.ktxhello.ui.actionbar

import android.app.Activity
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MyTabListener(private val activity: Activity, private val clazz: Class<out Fragment>) : ActionBar.TabListener {
    private var fragment: Fragment? = null

    override fun onTabSelected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        if (fragment == null) {
            fragment = Fragment.instantiate(activity, clazz.name)
            ft.add(android.R.id.content, fragment!!, null)
        }
        ft.attach(fragment!!)
    }

    override fun onTabUnselected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        if (fragment != null) {
            ft.detach(fragment!!) //删除旧画面
        }
    }

    override fun onTabReselected(tab: ActionBar.Tab, ft: FragmentTransaction) {
        //
    }

}