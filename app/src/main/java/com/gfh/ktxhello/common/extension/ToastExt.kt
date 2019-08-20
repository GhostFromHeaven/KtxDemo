package com.gfh.ktxhello.common.extension

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gfh.ktxhello.R


fun Context.customToast(message: String, gravity: Int = Gravity.CENTER, duration: Int = Toast.LENGTH_SHORT) {
    val toast = Toast(this)
    val view = LayoutInflater.from(this).inflate(R.layout.toast_custom_layout, null)
    val textView: TextView = view.findViewById(R.id.textView)
    textView.text = message
    toast.view = view
    toast.setGravity(gravity, 0, 0)
    toast.duration = duration
    toast.show()
}

fun Context.centerToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    customToast(message, Gravity.CENTER, duration)
}

fun Context.centerToast(message: Int, duration: Int = Toast.LENGTH_SHORT) {
    centerToast(getString(message), duration)
}

fun Context.centerLongToast(message: String) {
    centerToast(message, Toast.LENGTH_LONG)
}

fun Context.centerLongToast(message: Int) {
    centerToast(getString(message), Toast.LENGTH_LONG)
}

fun Context.topToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    customToast(message, Gravity.TOP or Gravity.CENTER_HORIZONTAL, duration)
}

fun Context.topToast(message: Int, duration: Int = Toast.LENGTH_SHORT) {
    customToast(getString(message), Gravity.TOP or Gravity.CENTER_HORIZONTAL, duration)
}

fun Context.topLongToast(message: String) {
    topToast(message, Toast.LENGTH_LONG)
}

fun Context.topLongToast(message: Int) {
    topToast(getString(message), Toast.LENGTH_LONG)
}


fun Fragment.centerToast(message: String) {
    requireActivity().centerToast(message)
}

fun Fragment.centerToast(message: Int) {
    requireActivity().centerToast(message)
}

fun Fragment.centerLongToast(message: String) {
    requireActivity().centerLongToast(message)
}

fun Fragment.centerLongToast(message: Int) {
    requireActivity().centerLongToast(message)
}

fun Fragment.topToast(message: String) {
    requireActivity().centerToast(message)
}

fun Fragment.topToast(message: Int) {
    requireActivity().centerToast(message)
}

fun Fragment.topLongToast(message: String) {
    requireActivity().topLongToast(message)
}

fun Fragment.topLongToast(message: Int) {
    requireActivity().topLongToast(message)
}