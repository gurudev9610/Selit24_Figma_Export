package com.guruprasadsapplication.app.modules.loginpage.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithPhon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_phon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithEmai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)

)
