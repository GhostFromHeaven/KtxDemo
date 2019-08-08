package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity
import org.jetbrains.anko.toast

class CheckboxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkbox_activity)

        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        val checkbox3 = findViewById<CheckBox>(R.id.checkbox3)

        val buttonLogin = findViewById<Button>(R.id.btn_login)

        buttonLogin.setOnClickListener {
            var checked = ""
            if (checkbox1.isChecked) {
                checked += checkbox1.text
                checked+="\n"
            }
            if (checkbox2.isChecked) {
                checked += checkbox2.text
                checked+="\n"
            }
            if (checkbox3.isChecked) {
                checked += checkbox3.text
            }

            toast(checked)
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<CheckboxActivity> {  }
        }
    }
}
