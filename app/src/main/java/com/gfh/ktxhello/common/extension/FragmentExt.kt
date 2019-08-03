package com.gfh.ktxhello.common.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

val Fragment.safeContext: Context
    get() = requireContext()


val Fragment.applicationContext: Context
    get() = requireContext().applicationContext


val Fragment.safeActivity: FragmentActivity
    get() = requireActivity()


inline fun <reified T : Activity> Fragment.startActivity(block: Intent.() -> Unit = {}) {
    val intent = Intent(safeContext, T::class.java)
    intent.block()
    if(this !is Activity) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    startActivity(intent)
}
