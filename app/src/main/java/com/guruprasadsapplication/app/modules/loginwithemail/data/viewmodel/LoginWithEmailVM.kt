package com.guruprasadsapplication.app.modules.loginwithemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.loginwithemail.`data`.model.LoginWithEmailModel
import org.koin.core.KoinComponent

class LoginWithEmailVM : ViewModel(), KoinComponent {
  val loginWithEmailModel: MutableLiveData<LoginWithEmailModel> =
      MutableLiveData(LoginWithEmailModel())

  var navArguments: Bundle? = null
}
