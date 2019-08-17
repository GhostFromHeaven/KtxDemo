package com.gfh.ktxhello.ui.resource

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class DrawableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawable_activity)

        val button: Button = findViewById(R.id.btn_login)
        val editText: EditText = findViewById(R.id.editText)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //
                button.isEnabled = editText.length() > 0
            }

            override fun afterTextChanged(s: Editable?) {
                //
            }
        })
    }
}
