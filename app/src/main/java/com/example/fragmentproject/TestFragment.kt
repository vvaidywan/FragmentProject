package com.example.fragmentproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TestFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_test, container, false)
        return view
    }

    // Ques1 : Observe Lifecycle of Fragment with activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Fragment Lifecycle", "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Fragment Lifecycle", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Fragment Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Fragment Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Fragment Lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Fragment Lifecycle", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Fragment Lifecycle", "onDestroy called")
    }
}