package com.neocaptainnemo.splash2ndjune

import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class MyViewModel(val resources: Resources) : ViewModel() {

    fun doSmth() {


       val value =  resources.getString(R.string.app_name)


    }

}