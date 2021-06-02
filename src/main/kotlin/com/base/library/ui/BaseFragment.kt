package com.base.library.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}