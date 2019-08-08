package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Chronometer
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class ChronometerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chronometer_activity)

        val chronometer = findViewById<Chronometer>(R.id.chronometer)
        chronometer.base = SystemClock.elapsedRealtime()
        chronometer.format = "%s"
        chronometer.start()
        chronometer.setOnChronometerTickListener {
            if(SystemClock.elapsedRealtime() -chronometer.base >= 60000) {
                chronometer.stop()
            }
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<ChronometerActivity> { }
        }
    }
}
