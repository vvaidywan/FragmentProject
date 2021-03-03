package com.example.fragmentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.preference.PreferenceFragmentCompat

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentTransaction: FragmentTransaction
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Activity Lifecycle", "onCreate1 called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Activity Lifecycle", "onCreate2 called")

        // Ques 2 : Observe Lifecycle of Fragment with activity while using Add, Replace, hide, show, remove
        // Ans- using FragmentA, (dynamic)

        val btnA = findViewById<Button>(R.id.btnA)
        btnA.setOnClickListener(View.OnClickListener {
            val fragment = FragmentA()
            fragmentManager = supportFragmentManager
            fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frameLayout, fragment)
            //fragmentTransaction.replace(R.id.frameLayout, fragment)
            //fragmentTransaction.hide(fragment)
            //fragmentTransaction.show(fragment)
            //fragmentTransaction.remove(fragment)
            fragmentTransaction.commit()
        })

        // Ques 3 : Dialog fragment, Preference Fragment
        // using DialogFragA class

        val btnB = findViewById<Button>(R.id.btnB)
        fragmentManager = supportFragmentManager
        btnB.setOnClickListener(View.OnClickListener {
            DialogFragA().show(fragmentManager, "huh")
        })

        val btnD = findViewById<Button>(R.id.btnD)
        btnD.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, PrefFragActivity::class.java)
            startActivity(intent)
        })

        // Ques 4 : landscape mode two fragments side by side

        val btnC = findViewById<Button>(R.id.btnC)
        btnC.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, LandscapeActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity Lifecycle", "onPause called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity Lifecycle", "onRestart called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity Lifecycle", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity Lifecycle", "onDestroy called")
    }
}
class MySettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference, rootKey)
    }
}

