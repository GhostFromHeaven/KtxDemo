package com.gfh.ktxhello.ui.event

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import com.gfh.ktxhello.R

class HatView(context: Context) : View(context) {
    private var paint: Paint = Paint()
    private var bitmap: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.touch_event_hat)
    private var xOffset = 0.0f
    private var yOffset = 0.0f

    private var bitmapX: Float = 0.0f // 帽子显示位置的X坐标
    private var bitmapY: Float = 0.0f // 帽子显示位置的Y坐标

    init {
        //创建Paint对象
        //根据图片生成位图对象
        xOffset = bitmap.width / 2.0f
        yOffset = bitmap.height / 2.0f

        //重写构造方法
        bitmapX = xOffset // 设置帽子的默认显示位置的X坐标
        bitmapY = yOffset // 设置帽子的默认显示位置的Y坐标
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawBitmap(bitmap, bitmapX - xOffset, bitmapY - yOffset, paint) // 绘制帽子
    }

    fun moveTo(x: Float, y: Float) {
        bitmapX = x
        bitmapY = y
        invalidate()
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }
}
