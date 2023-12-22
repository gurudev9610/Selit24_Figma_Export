package com.guruprasadsapplication.app.modules.loginwithphone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.loginwithphone.`data`.model.LoginWithPhoneModel
import org.koin.core.KoinComponent

class LoginWithPhoneVM : ViewModel(), KoinComponent {
  val loginWithPhoneModel: MutableLiveData<LoginWithPhoneModel> =
      MutableLiveData(LoginWithPhoneModel())

  var navArguments: Bundle? = null
}
