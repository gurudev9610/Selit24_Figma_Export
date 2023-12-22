package com.guruprasadsapplication.app.modules.resetpassword.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPass: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
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
