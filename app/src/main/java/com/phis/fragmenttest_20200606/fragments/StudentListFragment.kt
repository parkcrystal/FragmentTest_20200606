package com.phis.fragmenttest_20200606.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phis.fragmenttest_20200606.R
import kotlinx.android.synthetic.main.fragment_my_profile.*


class StudentListFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dialBtn.setOnClickListener {
            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:$inputPhoneNum")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)
        }
    }



}