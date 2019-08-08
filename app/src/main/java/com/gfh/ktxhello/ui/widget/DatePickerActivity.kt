package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity
import org.jetbrains.anko.toast
import java.time.Year
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    var year :Int = 0
    var month :Int = 0
    var day :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date_picker_activity)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)

        val calendar = Calendar.getInstance()
        year = calendar.get(Calendar.YEAR)
        month = calendar.get(Calendar.MONTH)
        day = calendar.get(Calendar.DAY_OF_MONTH)

        datePicker.init(year, month, day, object:DatePicker.OnDateChangedListener{
            override fun onDateChanged(datePicker: DatePicker?, year: Int, month: Int, day: Int) {
                this@DatePickerActivity.year = year
                this@DatePickerActivity.month = month
                this@DatePickerActivity.day = day

                show()
            }
        })
    }

    private fun show() {
        toast("$year-${month+1}-$day")
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<DatePickerActivity> {  }
        }
    }
}
