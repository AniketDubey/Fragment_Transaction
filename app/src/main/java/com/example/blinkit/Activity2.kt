package com.example.blinkit

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d("Lifecycle2", "onCreate2 called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle2", "onStart2 called")
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("Lifecycle2", "onConfigurationChanged2 called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle2", "onResume2 called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle2", "onPause2 called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle2", "onStop2 called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle2", "onRestart2 called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle2", "onDestroy2 called")
    }
}