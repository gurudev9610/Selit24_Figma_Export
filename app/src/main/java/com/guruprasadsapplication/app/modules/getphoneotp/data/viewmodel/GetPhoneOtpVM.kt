package com.guruprasadsapplication.app.modules.getphoneotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.getphoneotp.`data`.model.GetPhoneOtpModel
import org.koin.core.KoinComponent

class GetPhoneOtpVM : ViewModel(), KoinComponent {
  val getPhoneOtpModel: MutableLiveData<GetPhoneOtpModel> = MutableLiveData(GetPhoneOtpModel())

  var navArguments: Bundle? = null
}
