package com.gfh.ktxhello.ui.fragment

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.gfh.ktxhello.R

class WeChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        setContentView(R.layout.we_chat_activity)

        val findFragment = WeChatFindFragment()
        val meFragment = WeChatMeFragment()
        val messageFragment = WeChatMessageFragment()
        val sessionFragment = WeChatSessionFragment()

        val imageView1: ImageView = findViewById(R.id.image1)
        val imageView2: ImageView = findViewById(R.id.image2)
        val imageView3: ImageView = findViewById(R.id.image3)
        val imageView4: ImageView = findViewById(R.id.image4)

        imageView1.setOnClickListener {
            transToFragment(sessionFragment)
        }
        imageView2.setOnClickListener {
            transToFragment(messageFragment)
        }
        imageView3.setOnClickListener {
            transToFragment(findFragment)
        }
        imageView4.setOnClickListener {
            transToFragment(meFragment)
        }

        transToFragment(sessionFragment)
    }

    fun transToFragment(fragment:Fragment) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.fragment, fragment)
        ft.commit()
    }
}
