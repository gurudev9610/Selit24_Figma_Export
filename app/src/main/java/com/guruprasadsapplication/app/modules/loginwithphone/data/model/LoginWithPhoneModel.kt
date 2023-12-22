package com.guruprasadsapplication.app.modules.loginwithphone.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginWithPhoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourmobi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_mobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null
)
