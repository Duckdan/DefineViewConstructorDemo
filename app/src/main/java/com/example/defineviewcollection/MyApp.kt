package com.example.defineviewcollection

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityPaused(activity: Activity) {
                Log.e("MyApp::", "onActivityPaused")
            }

            override fun onActivityStarted(activity: Activity) {
                Log.e("MyApp::", "onActivityStarted")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.e("MyApp::", "onActivityDestroyed")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.e("MyApp::", "onActivitySaveInstanceState")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.e("MyApp::", "onActivityStopped")
            }

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.e("MyApp::", "onActivityCreated")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.e("MyApp::", "onActivityResumed")
            }

        })
    }
}