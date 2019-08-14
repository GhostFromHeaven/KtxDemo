package com.gfh.ktxhello.ui.event

import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import org.jetbrains.anko.toast

class KeyEventActivity : AppCompatActivity() {
    private var lastBackKeyTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.key_event_activity)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        toast("Touch : ${event.action} (${event.rawX}, ${event.rawY})")
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        //toast("Key Down $keyCode")
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onKeyBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        // toast("Key Up $keyCode")
        return super.onKeyUp(keyCode, event)
    }

    private fun onKeyBack() {
        if (System.currentTimeMillis() - lastBackKeyTime > 2000) {
            lastBackKeyTime = System.currentTimeMillis()
            toast("再按一次推出应用")
        } else {
            finish()
        }
    }
}
