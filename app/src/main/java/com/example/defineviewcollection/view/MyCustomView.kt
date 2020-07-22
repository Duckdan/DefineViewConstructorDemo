package com.example.defineviewcollection.view

import android.content.Context
import android.content.res.TypedArray
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import com.example.defineviewcollection.R

class MyCustomView : View {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(
        context,
        attrs,
        0
    )

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
//        val ta = context.obtainStyledAttributes(attrs, R.styleable.MyCustomView)
        val ta =
            context.obtainStyledAttributes(
                attrs,
                R.styleable.MyCustomView,
                defStyleAttr,
                R.style.MyCustomViewDefStyleRes
            )

        val attr1 = ta.getString(R.styleable.MyCustomView_custom_attr1)
        val attr2 = ta.getString(R.styleable.MyCustomView_custom_attr2)
        val attr3 = ta.getString(R.styleable.MyCustomView_custom_attr3)
        val attr4 = ta.getString(R.styleable.MyCustomView_custom_attr4)

        Log.e("customview", "attr1=$attr1")
        Log.e("customview", "attr2=$attr2")
        Log.e("customview", "attr3=$attr3")
        Log.e("customview", "attr4=$attr4")
        ta.recycle()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        val ta =
            context.obtainStyledAttributes(attrs, R.styleable.MyCustomView, defStyleAttr, 0)

        val attr1 = ta.getString(R.styleable.MyCustomView_custom_attr1)
        val attr2 = ta.getString(R.styleable.MyCustomView_custom_attr2)
        val attr3 = ta.getString(R.styleable.MyCustomView_custom_attr3)
        val attr4 = ta.getString(R.styleable.MyCustomView_custom_attr4)

        Log.e("customview", "4attr1=$attr1")
        Log.e("customview", "4attr2=$attr2")
        Log.e("customview", "4attr3=$attr3")
        Log.e("customview", "4attr4=$attr4")
        ta.recycle()
    }


}