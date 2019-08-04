package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class TextViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_view_activity)
    }

    companion object {
        fun start(context: Context) {
            context.startActivity<TextViewActivity> {  }
        }
    }
}
