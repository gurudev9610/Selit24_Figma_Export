package com.guruprasadsapplication.app.modules.changepassword.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
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
  var etEmailValueOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValueValue: String? = null
)
