package com.gfh.ktxhello.ui.widget

import android.content.Context
import android.os.Bundle
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity
import org.jetbrains.anko.toast

class TimePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.time_picker_activity)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        timePicker.setIs24HourView(true)
        timePicker.setOnTimeChangedListener { _, hour, minute ->
            toast("$hour-$minute")
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<TimePickerActivity> { }
        }
    }
}
