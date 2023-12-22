package com.guruprasadsapplication.app.modules.userverify.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.userverify.`data`.model.UserVerifyModel
import org.koin.core.KoinComponent

class UserVerifyVM : ViewModel(), KoinComponent {
  val userVerifyModel: MutableLiveData<UserVerifyModel> = MutableLiveData(UserVerifyModel())

  var navArguments: Bundle? = null
}
