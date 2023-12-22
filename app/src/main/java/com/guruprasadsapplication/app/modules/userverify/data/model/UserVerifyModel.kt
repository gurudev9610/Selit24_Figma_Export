package com.guruprasadsapplication.app.modules.userverify.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UserVerifyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserVerifiedS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_user_verified_s)

)
