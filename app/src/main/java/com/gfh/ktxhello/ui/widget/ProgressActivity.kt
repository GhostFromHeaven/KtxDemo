package com.gfh.ktxhello.ui.widget

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.startActivity
import kotlinx.coroutines.*
import org.jetbrains.anko.toast
import kotlin.math.min
import kotlin.random.Random

class ProgressActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private var progressValue: Int = 0
    private val handler = Handler { msg ->
        when (msg.what) {
            MSG_PROGRESS -> progressBar.progress = progressValue
            MSG_DONE -> {
                toast("耗时操作已完成")
                progressBar.visibility = View.GONE
            }
        }
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.progress_activity)

        progressBar = findViewById(R.id.progressBar1)

//        val thread = Thread {
//            while (true) {
//                progressValue += Random.nextInt(0, 10)
//                try {
//                    Thread.sleep(200)
//                } catch (t: Throwable) {
//                    //
//                }
//
//                if (progressValue < 100) {
//                    val msg = Message().apply { what = MSG_PROGRESS }
//                    handler.sendMessage(msg)
//                } else {
//                    handler.sendMessage(Message().apply { what = MSG_DONE })
//                }
//            }
//        }
//        thread.start()

        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                while (true) {
                    progressValue += Random.nextInt(0, 10)
                    delay(300)
                    runOnUiThread {
                        progressBar.progress = min(100, progressValue)
                        if (progressValue >= 100) {
                            toast("耗时操作已完成")
                            progressBar.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }

    companion object {
        const val MSG_PROGRESS = 0x111
        const val MSG_DONE = 0x110

        fun start(context: Context) {
            context.startActivity<ProgressActivity> { }
        }
    }
}
