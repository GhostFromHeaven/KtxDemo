package com.gfh.ktxhello.ui.event

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class TouchEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.touch_event_activity)

        val root: RelativeLayout = findViewById(R.id.relativeLayout)

        val hat = HatView(this)
        hat.setOnTouchListener { _, event ->
            hat.moveTo(event.x, event.y)
            true
        }

        root.addView(hat)
    }
}
