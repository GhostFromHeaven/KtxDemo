package com.gfh.ktxhello.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class SetResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_result_activity)

        val result: EditText = findViewById(R.id.et_result)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val resultString = result.text.toString()
            val intentLocal = intent
            if (resultString.isNotBlank()) {
                intentLocal.putExtra("result", resultString)
            }
            setResult(Activity.RESULT_OK, intentLocal)
            finish()
        }
    }
}
