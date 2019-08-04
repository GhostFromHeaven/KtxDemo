package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class ImageButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_button_activity)

        val start = findViewById<ImageButton>(R.id.start)
        start.setOnClickListener {
            Toast.makeText(this, "开始游戏", Toast.LENGTH_SHORT).show()
        }

        val switch1 = findViewById<ImageButton>(R.id.switch1)
        switch1.setOnClickListener {
            Toast.makeText(this, "切换账号", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<ImageButtonActivity> {  }
        }
    }
}
