package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity

class EditTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    companion object {
        fun start(context:Context) {
            context.startActivity<EditTextActivity> {  }
        }
    }
}
