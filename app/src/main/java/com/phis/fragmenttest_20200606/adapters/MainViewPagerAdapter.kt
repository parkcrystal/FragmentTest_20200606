package com.phis.fragmenttest_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragmenttest_20200606.fragments.MyProfileFragment
import com.phis.fragmenttest_20200606.fragments.StudentListFragment

class MainViewPagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "내프로필"
        }
        else {
            return "수강생목록"
        }
    }

    override fun getItem(position: Int) :Fragment {
        if (position == 0) {
            return MyProfileFragment()
        }
        else {
            return StudentListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

}