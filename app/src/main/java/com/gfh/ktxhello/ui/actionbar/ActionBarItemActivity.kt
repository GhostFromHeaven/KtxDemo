package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import org.jetbrains.anko.toast

class ActionBarItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_bar_item_activity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // val menuInflater = menuInflater
        menuInflater.inflate(R.menu.action_bar_item_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> toast("搜索")
            R.id.bell -> toast("通知")
            R.id.settings -> toast("设置")
            R.id.about -> toast("关于")
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
