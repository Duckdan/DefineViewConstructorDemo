package com.example.defineviewcollection.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup


/**
 *  创建View的时候调用方法顺序
 *   2020-07-27 18:50:11.454 16128-16128/? E/DefineViewGroup: init
    2020-07-27 18:50:11.588 16128-16128/? E/DefineViewGroup: onMeasure
    2020-07-27 18:50:11.601 16128-16128/? E/DefineViewGroup: onMeasure
    2020-07-27 18:50:11.603 16128-16128/? E/DefineViewGroup: onSizeChanged
    2020-07-27 18:50:11.603 16128-16128/? E/DefineViewGroup: onLayout
    2020-07-27 18:50:11.621 16128-16128/? E/DefineViewGroup: onDraw
    2020-07-27 18:50:11.621 16128-16128/? E/DefineViewGroup: dispatchDraw

requestLayout方法：
2020-07-27 18:50:53.417 16128-16128/com.example.defineviewcollection E/DefineViewGroup: onMeasure
2020-07-27 18:50:53.418 16128-16128/com.example.defineviewcollection E/DefineViewGroup: onLayout
2020-07-27 18:50:53.421 16128-16128/com.example.defineviewcollection E/DefineViewGroup: onDraw
2020-07-27 18:50:53.422 16128-16128/com.example.defineviewcollection E/DefineViewGroup: dispatchDraw

invalidate方法：
2020-07-27 18:51:09.746 16128-16128/com.example.defineviewcollection E/DefineViewGroup: onDraw
2020-07-27 18:51:09.746 16128-16128/com.example.defineviewcollection E/DefineViewGroup: dispatchDraw


 */
class DefineViewGroup @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {
    val TAG = "DefineViewGroup"

    init {
        Log.e(TAG,"init")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.e(TAG,"onMeasure")
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        Log.e(TAG,"onLayout")
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.e(TAG,"onSizeChanged")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e(TAG,"onDraw")
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
        Log.e(TAG,"dispatchDraw")
    }

    fun userRequestLayout() {
        requestLayout()
    }

    fun useInvalidate() {
        invalidate()
    }
}