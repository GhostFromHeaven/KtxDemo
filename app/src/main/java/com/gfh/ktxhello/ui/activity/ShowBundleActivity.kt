package com.gfh.ktxhello.ui.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class ShowBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_bundle_activity)

        val bundle: Bundle? = intent?.extras

        val s1 = bundle?.getString("s1")
        val s2 = bundle?.getString("s2")

        val s11 = intent?.getStringExtra("s1")
        val s22 = intent?.getStringExtra("s2")

        val tvS1: TextView = findViewById(R.id.tv_s1)
        val tvS2: TextView = findViewById(R.id.tv_s2)

        tvS1.text = "$s1 : $s11"
        tvS2.text = "$s2 : $s22"
    }
}
