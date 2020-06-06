package com.phis.fragmenttest_20200606

import android.os.Bundle
import com.phis.fragmenttest_20200606.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity: BaseActivity() {


    lateinit var myAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MainViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }


}