package com.guruprasadsapplication.app.modules.homescreencontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.homescreencontainer.`data`.model.HomeScreenContainerModel
import org.koin.core.KoinComponent

class HomeScreenContainerVM : ViewModel(), KoinComponent {
  val homeScreenContainerModel: MutableLiveData<HomeScreenContainerModel> =
      MutableLiveData(HomeScreenContainerModel())

  var navArguments: Bundle? = null
}
