package com.example.retrofitgetkotlin.Fragment

import android.widget.TextView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.retrofitgetkotlin.R
import com.example.retrofitgetkotlin.databinding.FragmentPostApiBinding
import com.example.retrofitgetkotlin.viewmodel.MainViewModel

class PostApi : Fragment() {
    val mainViewModel: MainViewModel by viewModels()

    lateinit var dataBinding: FragmentPostApiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_post_api, container, false)
//        dataBinding.viewmodel = mainViewModel
        dataBinding.lifecycleOwner = viewLifecycleOwner
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.btnPostapi?.setOnClickListener(View.OnClickListener { item: View? -> mainViewModel!!.mutableLiveDataClickPostApi() })

    }
}