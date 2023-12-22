package com.guruprasadsapplication.app.modules.profile.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelit24User: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutApplicati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_about_applicati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRateus: String? = MyApp.getInstance().resources.getString(R.string.lbl_rate_us)

)
