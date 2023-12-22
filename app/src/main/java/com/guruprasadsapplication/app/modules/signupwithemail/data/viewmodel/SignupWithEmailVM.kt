package com.guruprasadsapplication.app.modules.signupwithemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.signupwithemail.`data`.model.SignupWithEmailModel
import org.koin.core.KoinComponent

class SignupWithEmailVM : ViewModel(), KoinComponent {
  val signupWithEmailModel: MutableLiveData<SignupWithEmailModel> =
      MutableLiveData(SignupWithEmailModel())

  var navArguments: Bundle? = null
}
