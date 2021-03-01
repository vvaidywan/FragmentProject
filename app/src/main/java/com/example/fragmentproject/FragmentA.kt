package com.example.fragmentproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.a_fragment, container, false)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Fragment A", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Fragment A", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Fragment A", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Fragment A", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Fragment A", "onStop called")
    }
}