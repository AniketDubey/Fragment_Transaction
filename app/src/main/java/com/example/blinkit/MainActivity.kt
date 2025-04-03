package com.example.blinkit

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.blinkit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var curFrag = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(binding.fragmentContainer.id, Fragment1())
            .addToBackStack("fragment_1") // idhar addtobackstack se yeh hoga ki black page se
            // fragment1 wali transaction ko store kiya gaya hai
            //to fragment1 ke hatne ke baad bhi ek black page rhega
            .commit()

        val btn = findViewById<Button>(R.id.moveBtn)
        btn.setOnClickListener {
            curFrag++
            if (curFrag == 2) {
                supportFragmentManager.beginTransaction()
                    .add(binding.fragmentContainer.id, Fragment2())
                    .addToBackStack("fragment_2")
                    .commit()
            } else if (curFrag == 3) {
                supportFragmentManager.beginTransaction()
                    .replace(binding.fragmentContainer.id, Fragment3())
//                    .addToBackStack("fragment_3")
                    .commit()
            } else if (curFrag == 4) {
                supportFragmentManager.beginTransaction()
                    .add(binding.fragmentContainer.id, Fragment4())
                    .addToBackStack("fragment_4")
                    .commit()
            }
            /*val intent = Intent(this, Activity2::class.java)
            startActivity(intent)*/
        }
        Log.d("Lifecycle1", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle1", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle1", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle1", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle1", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle1", "onRestart called")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("Lifecycle1", "onConfigurationChanged called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle1", "onDestroy called")
    }
}