package com.phis.fragmenttest_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragmenttest_20200606.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_pager.*

class MainActivity : BaseActivity() {


    lateinit var mainAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}
