package com.guruprasadsapplication.app.modules.getemailotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.getemailotp.`data`.model.GetEmailOtpModel
import org.koin.core.KoinComponent

class GetEmailOtpVM : ViewModel(), KoinComponent {
  val getEmailOtpModel: MutableLiveData<GetEmailOtpModel> = MutableLiveData(GetEmailOtpModel())

  var navArguments: Bundle? = null
}
