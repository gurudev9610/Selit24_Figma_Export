package com.guruprasadsapplication.app.modules.googlesuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.googlesuccess.`data`.model.GoogleSuccessModel
import org.koin.core.KoinComponent

class GoogleSuccessVM : ViewModel(), KoinComponent {
  val googleSuccessModel: MutableLiveData<GoogleSuccessModel> =
      MutableLiveData(GoogleSuccessModel())

  var navArguments: Bundle? = null
}
