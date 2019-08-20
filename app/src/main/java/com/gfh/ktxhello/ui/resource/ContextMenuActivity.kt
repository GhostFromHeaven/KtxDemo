package com.gfh.ktxhello.ui.resource

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import org.jetbrains.anko.toast

class ContextMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.context_menu_activity)

        val textView: TextView = findViewById(R.id.textView)
        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        val menuInflater = MenuInflater(this)
        when (v.id) {
            R.id.textView -> menuInflater.inflate(R.menu.context_menu_menu, menu)
            else -> super.onCreateContextMenu(menu, v, menuInfo)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.copy -> toast("复制")
            R.id.favor -> toast("收藏")
            R.id.translate -> toast("翻译")
        }
        return true
    }
}
