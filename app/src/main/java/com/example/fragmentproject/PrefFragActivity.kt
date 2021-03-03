package com.example.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class PrefFragActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pref_frag)

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.preferenceFragmentContainer, MySettingsFragment())
                .commit()
    }
}

