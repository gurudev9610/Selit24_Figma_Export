package com.guruprasadsapplication.app.modules.googlesuccess.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GoogleSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleaccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_google_account)

)
