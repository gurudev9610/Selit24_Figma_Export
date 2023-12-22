package com.guruprasadsapplication.app.modules.introscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.introscreen.`data`.model.IntroScreenModel
import org.koin.core.KoinComponent

class IntroScreenVM : ViewModel(), KoinComponent {
  val introScreenModel: MutableLiveData<IntroScreenModel> = MutableLiveData(IntroScreenModel())

  var navArguments: Bundle? = null
}
