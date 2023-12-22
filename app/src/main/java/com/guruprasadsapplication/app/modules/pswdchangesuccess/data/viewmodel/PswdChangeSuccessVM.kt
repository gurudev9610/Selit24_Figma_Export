package com.guruprasadsapplication.app.modules.pswdchangesuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.pswdchangesuccess.`data`.model.PswdChangeSuccessModel
import org.koin.core.KoinComponent

class PswdChangeSuccessVM : ViewModel(), KoinComponent {
  val pswdChangeSuccessModel: MutableLiveData<PswdChangeSuccessModel> =
      MutableLiveData(PswdChangeSuccessModel())

  var navArguments: Bundle? = null
}
