package com.gfh.ktxhello.ui.widget

import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import timber.log.Timber
import kotlin.math.max
import kotlin.math.min

class SeekBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seek_bar_activity)

        val imageView = findViewById<ImageView>(R.id.image)
        val seekBar = findViewById<SeekBar>(R.id.seekbar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(bar: SeekBar?, progress: Int, fromUser: Boolean) {
                Timber.i("[SeekBarActivity.seekBar.onProgressChanged] progress : $progress")
                imageView.imageAlpha = max(0, min(255, progress))
            }

            override fun onStartTrackingTouch(bar: SeekBar?) {
                Timber.i("[SeekBarActivity.seekBar.onStartTrackingTouch] <>")
            }

            override fun onStopTrackingTouch(bar: SeekBar?) {
                Timber.i("[SeekBarActivity.seekBar.onStopTrackingTouch] <>")
            }
        })

    }
}
