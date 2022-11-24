package com.example.myfirstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG = "condition"

    fun showMessage(s: String) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
        Log.d(TAG, s)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        showMessage("I created")
    }

}