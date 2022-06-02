package com.neocaptainnemo.splash2ndjune

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.neocaptainnemo.splash2ndjune.databinding.FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val binding = FragmentBlankBinding.bind(view)
    }

}