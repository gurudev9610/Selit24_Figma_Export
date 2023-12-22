package com.guruprasadsapplication.app.modules.aboutapplication.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.aboutapplication.`data`.model.AboutApplicationModel
import org.koin.core.KoinComponent

class AboutApplicationVM : ViewModel(), KoinComponent {
  val aboutApplicationModel: MutableLiveData<AboutApplicationModel> =
      MutableLiveData(AboutApplicationModel())

  var navArguments: Bundle? = null
}
