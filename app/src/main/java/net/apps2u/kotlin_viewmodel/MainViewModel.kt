package net.apps2u.kotlin_viewmodel

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count: Int = 0

    fun increment() {
        count++
    }
}