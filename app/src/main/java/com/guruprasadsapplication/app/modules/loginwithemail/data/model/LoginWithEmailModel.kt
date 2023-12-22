package com.guruprasadsapplication.app.modules.loginwithemail.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginWithEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_login_with_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonthaveacco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValueValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValueValue: String? = null
)
