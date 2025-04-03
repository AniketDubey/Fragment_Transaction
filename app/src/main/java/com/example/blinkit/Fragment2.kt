package com.example.blinkit

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentLifecycle", "onCreate()2 called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FragmentLifecycle", "onCreateView()2 called")
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentLifecycle", "onAttach()2 called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FragmentLifecycle", "onViewCreated()2 called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentLifecycle", "onStart()2 called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentLifecycle", "onResume()2 called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentLifecycle", "onPause()2 called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentLifecycle", "onStop()2 called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentLifecycle", "onDestroyView()2 called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentLifecycle", "onDestroy()2 called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentLifecycle", "onDetach()2 called")
    }
}