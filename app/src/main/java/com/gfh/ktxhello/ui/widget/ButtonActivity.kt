package com.gfh.ktxhello.ui.widget

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_activity)

        val button01 = findViewById<Button>(R.id.button01)

        button01.setOnClickListener {
            Toast.makeText(this, "授权并登录!", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<ButtonActivity> { }
        }
    }
}
