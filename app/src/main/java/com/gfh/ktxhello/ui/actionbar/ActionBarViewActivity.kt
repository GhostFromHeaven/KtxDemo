package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class ActionBarViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_bar_view_activity)

        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // val menuInflater = menuInflater
        menuInflater.inflate(R.menu.action_bar_view_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
