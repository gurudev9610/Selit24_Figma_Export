package com.guruprasadsapplication.app.modules.getphoneotp.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GetPhoneOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResend: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend)

)
