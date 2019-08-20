package com.gfh.ktxhello.ui.message

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.centerToast

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alert_dialog_activity)

        val button01: Button = findViewById(R.id.button01)
        val button02: Button = findViewById(R.id.button02)
        val button03: Button = findViewById(R.id.button03)
        val button04: Button = findViewById(R.id.button04)

        button01.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("提示")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("提示内容提示内容提示内容提示内容提示内容")
                .setPositiveButton("确定") { dialog, which ->
                    centerToast("确定")
                }
                .setNegativeButton("取消") { dialog, which ->
                    centerToast("取消")
                }
            dialog.show()
        }

        val items = arrayOf("当你有使命，它会让你更专注", "要么出众，要么出局", "活着就是为了改变世界", "求知若饥，虚心若愚")
        button02.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("提示")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(items) { dialog, which ->
                    centerToast(items[which])
                }
            dialog.show()
        }

        var selectIndex = 0
        button03.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("提示")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(items, selectIndex) { dialog, which ->
                    // centerToast(items[which])
                    selectIndex = which
                }
                .setPositiveButton("确定") { dialog, which ->
                    centerToast(items[selectIndex])
                }
            dialog.show()
        }


        val checkedItems = listOf(false, true, false, true, false).toBooleanArray()
        button04.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("提示")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(items, checkedItems) { dialog, which,isChecked ->
                    checkedItems[which] = isChecked
                }
                .setPositiveButton("确定") { dialog, which ->
                    val message = items.filterIndexed { index, s -> checkedItems[index] }.joinToString(",")
                    if (message.isBlank()) {
                        centerToast("没有选择")
                    } else {
                        centerToast(message)
                    }
                }
            dialog.show()
        }
    }
}
