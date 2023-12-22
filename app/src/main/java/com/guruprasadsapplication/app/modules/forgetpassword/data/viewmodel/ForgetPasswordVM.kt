package com.guruprasadsapplication.app.modules.forgetpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.forgetpassword.`data`.model.ForgetPasswordModel
import org.koin.core.KoinComponent

class ForgetPasswordVM : ViewModel(), KoinComponent {
  val forgetPasswordModel: MutableLiveData<ForgetPasswordModel> =
      MutableLiveData(ForgetPasswordModel())

  var navArguments: Bundle? = null
}
