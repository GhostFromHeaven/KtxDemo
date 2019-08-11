package com.gfh.ktxhello.ui.widget

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import com.gfh.ktxhello.R

class GridViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )//设置全屏显示

        supportActionBar?.hide()

        setContentView(R.layout.grid_view_activity)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = ImageAdapter(this)
    }

    class ImageAdapter(private val context: Context) : BaseAdapter() {
        private val pictures = listOf(
            R.mipmap.gridview_img01, R.mipmap.gridview_img02, R.mipmap.gridview_img03,
            R.mipmap.gridview_img04, R.mipmap.gridview_img05, R.mipmap.gridview_img06,
            R.mipmap.gridview_img07, R.mipmap.gridview_img08, R.mipmap.gridview_img09,
            R.mipmap.gridview_img10, R.mipmap.gridview_img11, R.mipmap.gridview_img12
        )

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val imageView: ImageView =
                if (convertView == null) {
                    ImageView(context).apply {
                        layoutParams = ViewGroup.LayoutParams(200, 200)
                        scaleType = ImageView.ScaleType.CENTER_CROP
                    }
                } else {
                    convertView as ImageView
                }
            imageView.setImageResource(pictures[position])
            return imageView
        }

        override fun getItem(position: Int): Any? {
            return null
        }

        override fun getItemId(position: Int): Long {
            return 0L
        }

        override fun getCount(): Int {
            return pictures.size
        }

    }
}
