package com.guruprasadsapplication.app.modules.phoneotpverify.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PhoneOtpVerifyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPVerifiedSu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verified_su)

)
