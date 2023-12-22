package com.guruprasadsapplication.app.modules.pswdchangesuccess.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PswdChangeSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordChange: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_change)

)
