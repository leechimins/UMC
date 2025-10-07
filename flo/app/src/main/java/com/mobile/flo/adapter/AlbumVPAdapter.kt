package com.mobile.flo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mobile.flo.DetailFragment
import com.mobile.flo.SongFragment
import com.mobile.flo.VideoFragment

class AlbumVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> SongFragment()
            1 -> DetailFragment()
            else -> VideoFragment()
        }
    }

}