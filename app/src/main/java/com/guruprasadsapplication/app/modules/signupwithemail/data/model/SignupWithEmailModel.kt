package com.guruprasadsapplication.app.modules.signupwithemail.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupWithEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_create_a_new_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_password)
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
  var etPasswordValueValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValueOneValue: String? = null
)
