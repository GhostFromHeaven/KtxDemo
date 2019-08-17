package com.gfh.ktxhello.ui.resource

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R


class ResourceActivity : AppCompatActivity() {
    val tvid = listOf(
        R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5,
        R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9
    )    //文本框组件ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resource_activity)

        //获取保存背景颜色的数组
        val colorList = resources.getIntArray(R.array.bgcolor)
        //获取保存显示文字的数组
        val wordList = resources.getStringArray(R.array.word)

        tvid.forEachIndexed { index, id ->
            val tv: TextView = findViewById(id)
            tv.setBackgroundColor(colorList[index])
            tv.text = wordList[index]
        }
    }
}
