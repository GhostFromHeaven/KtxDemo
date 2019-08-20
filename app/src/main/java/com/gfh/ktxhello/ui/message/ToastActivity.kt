package com.gfh.ktxhello.ui.message

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_activity)

        val button01: Button = findViewById(R.id.button01)
        val button02: Button = findViewById(R.id.button02)
        val button03: Button = findViewById(R.id.button03)

        button01.setOnClickListener {
            val toast = Toast.makeText(this, "Toast", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }

        button02.setOnClickListener {
            Toast.makeText(this, "Long Toast", Toast.LENGTH_LONG).show()
        }

        button03.setOnClickListener {
            val toast = Toast(this)
            val view = LayoutInflater.from(this).inflate(R.layout.toast_custom_layout, null)
            val textView: TextView = view.findViewById(R.id.textView)
            textView.text = "自定义Toast"
            toast.view = view
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }
}
