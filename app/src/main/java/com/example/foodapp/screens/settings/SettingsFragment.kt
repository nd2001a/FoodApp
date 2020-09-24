package com.example.foodapp.screens.settings

import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.example.foodapp.R
import com.example.foodapp.screens.base.BaseFragment
import com.example.foodapp.utilities.showToast
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    private lateinit var mFullnameText: TextView
    private lateinit var mDateText: TextView
    private lateinit var mEditUserButton: ImageView

    private lateinit var mPhoneNumberText: TextView
    private lateinit var mIdText: TextView

    private lateinit var mEmailText: TextView
    private lateinit var mCheckMailer: CheckBox
    private lateinit var mEditEmailButton: ImageView

    private lateinit var mBonusCount: TextView

    override fun onResume() {
        super.onResume()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        mEditUserButton.setOnClickListener {
            showToast("Редактировать пользователя")
        }
        mEditEmailButton.setOnClickListener {
            showToast("Редактировать email")
        }
    }

    private fun initFields() {
        mFullnameText = settings_fullname_text
        mDateText = settings_date_text
        mEditUserButton = settings_user_edit

        mPhoneNumberText = settings_phone_text
        mIdText = settings_id_text

        mEmailText = settings_email_text
        mCheckMailer = settings_check_mailing_box
        mEditEmailButton = settings_email_edit

        mBonusCount = settings_bonus_count
    }

}