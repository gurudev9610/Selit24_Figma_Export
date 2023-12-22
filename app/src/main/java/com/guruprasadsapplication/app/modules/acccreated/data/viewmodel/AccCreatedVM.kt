package com.guruprasadsapplication.app.modules.acccreated.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.acccreated.`data`.model.AccCreatedModel
import org.koin.core.KoinComponent

class AccCreatedVM : ViewModel(), KoinComponent {
  val accCreatedModel: MutableLiveData<AccCreatedModel> = MutableLiveData(AccCreatedModel())

  var navArguments: Bundle? = null
}
