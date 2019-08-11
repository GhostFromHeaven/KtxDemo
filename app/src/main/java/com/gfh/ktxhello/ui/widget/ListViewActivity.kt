package com.gfh.ktxhello.ui.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import com.gfh.ktxhello.R
import org.jetbrains.anko.toast

class ListViewActivity : AppCompatActivity() {
    private val pictures = listOf(
        R.mipmap.listview_img01, R.mipmap.listview_img02, R.mipmap.listview_img03,
        R.mipmap.listview_img04, R.mipmap.listview_img05, R.mipmap.listview_img06,
        R.mipmap.listview_img07, R.mipmap.listview_img08, R.mipmap.listview_img09
    )
    private val titles = listOf("刘一", "陈二", "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view_activity)

        supportActionBar?.hide()

        val list = mutableListOf<Map<String, Any>>()
        for (i in 0 until titles.size) {
            val map: Map<String, Any> = mapOf(
                "image" to pictures[i],
                "title" to titles[i]
            )
            list.add(map)
        }

        val adapter = SimpleAdapter(
            this,
            list,
            R.layout.listview_item,
            arrayOf("title", "image"),
            arrayOf(R.id.title, R.id.image).toIntArray()
        )

        val listView: ListView = findViewById(R.id.listview)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val map = list[position]
            toast(map["title"] as String)
        }
    }
}
