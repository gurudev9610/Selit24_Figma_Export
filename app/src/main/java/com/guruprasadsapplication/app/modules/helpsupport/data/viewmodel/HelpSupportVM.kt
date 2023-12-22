package com.guruprasadsapplication.app.modules.helpsupport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.helpsupport.`data`.model.HelpSupportModel
import org.koin.core.KoinComponent

class HelpSupportVM : ViewModel(), KoinComponent {
  val helpSupportModel: MutableLiveData<HelpSupportModel> = MutableLiveData(HelpSupportModel())

  var navArguments: Bundle? = null
}
