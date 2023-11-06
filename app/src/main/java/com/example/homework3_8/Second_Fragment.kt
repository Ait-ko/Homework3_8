package com.example.homework3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.homework3_8.databinding.FragmentMainBinding
import com.example.homework3_8.databinding.FragmentNextBinding

class Second_Fragment : Fragment() {

    private lateinit var binding:FragmentSecondBinding
    private lateinit var data:Unit
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data = arguments?.getSerializable("key") as Unit
            binding.apply {
               tvUnitName.text = data.name
                tvIsHeAlive.text = data.isHeAlive
                Glide.with(ivUnitPicture).load(data.picture).into(ivUnitPicture)
            }
    }
}