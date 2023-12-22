package com.guruprasadsapplication.app.modules.loginwithgoogle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.loginwithgoogle.`data`.model.LoginWithGoogleModel
import org.koin.core.KoinComponent

class LoginWithGoogleVM : ViewModel(), KoinComponent {
  val loginWithGoogleModel: MutableLiveData<LoginWithGoogleModel> =
      MutableLiveData(LoginWithGoogleModel())

  var navArguments: Bundle? = null
}
