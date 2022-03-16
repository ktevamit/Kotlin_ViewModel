package net.apps2u.kotlin_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    lateinit var resultTextView: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        resultTextView = findViewById(R.id.resultTextView)
        setText()
    }

    fun increment(v: View) {
        mainViewModel.increment()
        setText()
    }

    private fun setText() {
        resultTextView.text = mainViewModel.count.toString()
    }
}