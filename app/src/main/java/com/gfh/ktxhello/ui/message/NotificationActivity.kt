package com.gfh.ktxhello.ui.message

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.gfh.ktxhello.R


class NotificationActivity : AppCompatActivity() {
    private val notificationManager by lazy { getSystemService(NOTIFICATION_SERVICE) as NotificationManager }

    private val builder: NotificationCompat.Builder by lazy {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "notification", NotificationManager.IMPORTANCE_DEFAULT)
            channel.description = ""
            notificationManager.createNotificationChannel(channel)
            NotificationCompat.Builder(this, channelId)
        } else {
            NotificationCompat.Builder(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification_activity)

        val button: Button = findViewById(R.id.button01)

        button.setOnClickListener {
            builder.setContentTitle("通知标题")
            builder.setContentText("通知内容")
            builder.setSmallIcon(R.mipmap.ic_launcher_round)
            builder.setAutoCancel(false)
            builder.setWhen(System.currentTimeMillis())
            builder.setSound(null)

            val intent = Intent(this, NotificationDetailActivity::class.java)
            val pi = PendingIntent.getActivity(this, 0, intent, 0)
            builder.setContentIntent(pi)

            notificationManager.notify(messageId, builder.build())
        }
    }

    companion object {
        private const val messageId = 0x1234
        private const val channelId = "com.gfh.ktxhello.notification.channel01"
    }
}
