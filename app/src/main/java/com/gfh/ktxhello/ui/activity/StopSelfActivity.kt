package com.gfh.ktxhello.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gfh.ktxhello.R

class StopSelfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stop_self_activity)

        val button: Button = findViewById(R.id.button_stop_self)
        button.setOnClickListener {
            finish()
        }
    }
}
