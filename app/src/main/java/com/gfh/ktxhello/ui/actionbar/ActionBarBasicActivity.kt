package com.gfh.ktxhello.ui.actionbar

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class ActionBarBasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_bar_basic_activity)

        val hideActionBar: Button = findViewById(R.id.hideActionBar)
        val showActionBar: Button = findViewById(R.id.showActionBar)

        hideActionBar.setOnClickListener {
            supportActionBar?.hide()
        }

        showActionBar.setOnClickListener {
            supportActionBar?.show()
        }
    }
}
