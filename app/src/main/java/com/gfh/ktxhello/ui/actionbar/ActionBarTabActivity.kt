package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.gfh.ktxhello.R

class ActionBarTabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_bar_tab_activity)

        val actionBar = supportActionBar ?: return
        actionBar.navigationMode = ActionBar.NAVIGATION_MODE_TABS
        actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE)

        addTab(actionBar, "Tab1", ActionBarTab1Fragment::class.java)
        addTab(actionBar, "Tab2", ActionBarTab2Fragment::class.java)
        addTab(actionBar, "Tab3", ActionBarTab3Fragment::class.java)
        addTab(actionBar, "Tab4", ActionBarTab4Fragment::class.java)
    }

    private fun addTab(actionBar: ActionBar, name: String, clazz: Class<out Fragment>) {
        actionBar.addTab(actionBar.newTab().setText(name).setTabListener(MyTabListener(this, clazz)))
    }
}
