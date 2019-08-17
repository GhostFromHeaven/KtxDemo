package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class ActionBarNavUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_bar_nav_up_activity)

        supportActionBar?.run {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                //NavUtils.navigateUpFromSameTask(this)
                finish()
            }
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
