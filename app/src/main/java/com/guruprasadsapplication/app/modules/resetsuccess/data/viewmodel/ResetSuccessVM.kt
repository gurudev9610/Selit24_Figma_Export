package com.guruprasadsapplication.app.modules.resetsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.resetsuccess.`data`.model.ResetSuccessModel
import org.koin.core.KoinComponent

class ResetSuccessVM : ViewModel(), KoinComponent {
  val resetSuccessModel: MutableLiveData<ResetSuccessModel> = MutableLiveData(ResetSuccessModel())

  var navArguments: Bundle? = null
}
