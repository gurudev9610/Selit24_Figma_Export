package com.guruprasadsapplication.app.modules.phoneotpverify.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.phoneotpverify.`data`.model.PhoneOtpVerifyModel
import org.koin.core.KoinComponent

class PhoneOtpVerifyVM : ViewModel(), KoinComponent {
  val phoneOtpVerifyModel: MutableLiveData<PhoneOtpVerifyModel> =
      MutableLiveData(PhoneOtpVerifyModel())

  var navArguments: Bundle? = null
}
