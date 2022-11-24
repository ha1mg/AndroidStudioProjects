package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (count % 2 == 1 || count == 0) Toast.makeText(this,R.string.ncreate,Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        if (count % 2 == 1 || count == 0) Toast.makeText(this,R.string.nsatrt,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        if (count % 2 == 1 || count == 0)  Toast.makeText(this,R.string.nresume,Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        if (count % 2 == 0) Toast.makeText(this,R.string.ndestroy,Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", ++count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("count")
    }
}