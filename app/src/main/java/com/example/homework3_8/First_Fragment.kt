package com.example.homework3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.homework3_8.databinding.ActivityMainBinding
import com.example.homework3_8.databinding.FragmentMainBinding



class First_Fragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root

    }
    private val UnitList = arrayListOf(
                Unit("https://static.wikia.nocookie.net/onepiece/images/f/f9/Monkey_D._Luffy%27s_Current_Wanted_Poster.png/revision/latest/scale-to-width-down/78?cb=20190719165257&path-prefix=ru","Luffy","Alive")
                Unit("https://static.wikia.nocookie.net/onepiece/images/5/5d/Roronoa_Zoro%27s_Current_Wanted_Poster.png/revision/latest/scale-to-width-down/78?cb=20200418112544&path-prefix=ru","Zoro","Alive")
                Unit("https://static.wikia.nocookie.net/onepiece/images/3/3b/Nami%27s_Current_Wanted_Poster.png/revision/latest/scale-to-width-down/78?cb=20200418112824&path-prefix=ru","Nami","Alive")
                Unit("https://static.wikia.nocookie.net/onepiece/images/d/db/Sanji%27s_Wanted_Poster.png/revision/latest/scale-to-width-down/97?cb=20130322110002&path-prefix=ru","Sanji","Alive")
                Unit("https://static.wikia.nocookie.net/onepiece/images/9/90/Gol_D._Roger_Wanted_Poster.png/revision/latest/scale-to-width-down/75?cb=20210328132014&path-prefix=ru","Roger","Daed")
                Unit("https://static.wikia.nocookie.net/onepiece/images/2/22/Buggy%27s_Wanted_Poster.png/revision/latest/scale-to-width-down/76?cb=20140826092211&path-prefix=ru","Buggy","Alive")
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Unit_Adapter(UnitList, this:: onClick)
        binding.rvUnit.adapter = adapter
    }
    private fun onClick(position:Int){
        findNavController().navigate(R.id.second_Fragment, bundleOf("key" to UnitList[position]))
    }

}