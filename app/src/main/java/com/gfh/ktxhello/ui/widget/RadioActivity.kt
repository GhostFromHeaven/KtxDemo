package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class RadioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.radio_activity)

        val rg = findViewById<RadioGroup>(R.id.radio_group)

        rg.setOnCheckedChangeListener { _, id ->
            val choice = when (id) {
                R.id.radio_button_a -> "A"
                R.id.radio_button_b -> "B"
                R.id.radio_button_c -> "C"
                R.id.radio_button_d -> "D"
                else -> ""
            }
            Toast.makeText(this@RadioActivity, "选择了 $choice", Toast.LENGTH_SHORT).show()
        }

        val bt = findViewById<Button>(R.id.bt)
        bt.setOnClickListener {
            for (i in 0 until rg.childCount) {
                val rb = rg.getChildAt(i) as RadioButton
                if (rb.isChecked) {
                    if (rb.text == "B:100") {
                        Toast.makeText(this@RadioActivity, "正确", Toast.LENGTH_SHORT).show()
                    } else {
                        AlertDialog.Builder(this@RadioActivity)
                            .setMessage("错误")
                            .setPositiveButton("确定", null)
                            .show()
                    }
                    return@setOnClickListener
                }
            }

            AlertDialog.Builder(this@RadioActivity)
                .setMessage("请先选择")
                .setPositiveButton("确定", null)
                .show()
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<RadioActivity> { }
        }
    }
}
