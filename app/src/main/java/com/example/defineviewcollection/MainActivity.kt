package com.example.defineviewcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import leakcanary.LeakCanary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("MyApp::", "onCreate==1")
        super.onCreate(savedInstanceState)
        Log.e("MyApp::", "onCreate==2")
        setContentView(R.layout.activity_main)
        Log.e("MyApp::", "onCreate==3")
//        val view = LayoutInflater.from(applicationContext).inflate(R.layout.activity_main, null)
//        setContentView(view)

        id_custom_view.setOnClickListener {
            Log.e("MyApp::", "setOnClickListener")
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.e("MyApp::", "dispatchTouchEvent")
        return super.dispatchTouchEvent(ev)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.e("MyApp::", "onTouchEvent")
        return super.onTouchEvent(event)
    }
}