package com.gfh.ktxhello.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R

class StartForResultActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_for_result_activity)

        tvResult = findViewById(R.id.tv_result)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SetResultActivity::class.java)
            startActivityForResult(intent, 0x11)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0x11) {
            if (resultCode == Activity.RESULT_OK) {
                val bundle = data?.extras
                val result = bundle?.getString("result")
                tvResult.text = result ?: "没有结果"
            } else {
                tvResult.text = "请求失败"
            }
        }
    }
}
