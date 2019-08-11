package com.gfh.ktxhello.ui.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TabHost
import com.gfh.ktxhello.R

class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tab_activity)

        val tabHost :TabHost= findViewById(android.R.id.tabhost)
        tabHost.setup()

        val inflater = LayoutInflater.from(this)
        inflater.inflate(R.layout.tab1, tabHost.tabContentView)
        inflater.inflate(R.layout.tab2, tabHost.tabContentView)
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("精选表情").setContent(R.id.linearlayout1))

        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("投稿表情").setContent(R.id.framelayout))
    }
}
