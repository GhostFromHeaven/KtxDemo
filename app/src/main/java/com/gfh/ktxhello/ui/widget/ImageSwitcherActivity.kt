package com.gfh.ktxhello.ui.widget

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageSwitcher
import android.widget.ImageView
import com.gfh.ktxhello.R


class ImageSwitcherActivity : AppCompatActivity() {
    private val pictures = listOf(
        R.mipmap.imageswitcher_img01, R.mipmap.imageswitcher_img02, R.mipmap.imageswitcher_img03,
        R.mipmap.imageswitcher_img04, R.mipmap.imageswitcher_img05, R.mipmap.imageswitcher_img06,
        R.mipmap.imageswitcher_img07, R.mipmap.imageswitcher_img08, R.mipmap.imageswitcher_img09
    )

    var pictureIndex: Int = 0
    var touchDownX = 0.0f
    var touchUpX = 0.0f

    lateinit var imageSwitcher: ImageSwitcher

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )//设置全屏显示

        supportActionBar?.hide()

        setContentView(R.layout.image_switcher_activity)

        imageSwitcher = findViewById(R.id.imageSwitcher)

        imageSwitcher.setFactory {
            val imageView = ImageView(this@ImageSwitcherActivity)
            imageView.setImageResource(pictures[pictureIndex])
            imageView
        }

        val slideInLeft = AnimationUtils.loadAnimation(this@ImageSwitcherActivity, R.anim.slide_in_left)
        val slideOutRight = AnimationUtils.loadAnimation(this@ImageSwitcherActivity, R.anim.slide_out_right)
        val slideInRight = AnimationUtils.loadAnimation(this@ImageSwitcherActivity, R.anim.slide_in_right)
        val slideOutLeft = AnimationUtils.loadAnimation(this@ImageSwitcherActivity, R.anim.slide_out_left)

        imageSwitcher.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                touchDownX = event.x
                true
            } else if (event.action == MotionEvent.ACTION_UP) {
                touchUpX = event.x
                if (touchUpX - touchDownX > 100) {
                    pictureIndex = if (pictureIndex == 0) pictures.size - 1 else pictureIndex - 1
                    imageSwitcher.inAnimation = slideInLeft
                    imageSwitcher.outAnimation = slideOutRight
                    imageSwitcher.setImageResource(pictures[pictureIndex])
                } else if (touchDownX - touchUpX > 100) {
                    pictureIndex = if (pictureIndex == pictures.size - 1) 0 else pictureIndex + 1
                    imageSwitcher.inAnimation = slideInRight
                    imageSwitcher.outAnimation = slideOutLeft
                    imageSwitcher.setImageResource(pictures[pictureIndex])
                }
                true
            } else {
                false
            }
        }

    }
}
