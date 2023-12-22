package com.guruprasadsapplication.app.modules.googleaccallow.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.googleaccallow.`data`.model.GoogleAccAllowModel
import org.koin.core.KoinComponent

class GoogleAccAllowVM : ViewModel(), KoinComponent {
  val googleAccAllowModel: MutableLiveData<GoogleAccAllowModel> =
      MutableLiveData(GoogleAccAllowModel())

  var navArguments: Bundle? = null
}
