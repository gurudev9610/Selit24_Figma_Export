package com.guruprasadsapplication.app.modules.resetsuccess.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordReset: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_reset)

)
