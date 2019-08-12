package com.gfh.ktxhello.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gfh.ktxhello.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        val button: Button = findViewById(R.id.button_start_activity)
        button.setOnClickListener {
            val intent = Intent(this, StopSelfActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button_stop_self)
        button2.setOnClickListener {
            finish()
        }
    }
}
