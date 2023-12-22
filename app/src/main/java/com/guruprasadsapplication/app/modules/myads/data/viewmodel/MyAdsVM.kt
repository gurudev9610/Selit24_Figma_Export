package com.guruprasadsapplication.app.modules.myads.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.myads.`data`.model.MyAdsModel
import org.koin.core.KoinComponent

class MyAdsVM : ViewModel(), KoinComponent {
  val myAdsModel: MutableLiveData<MyAdsModel> = MutableLiveData(MyAdsModel())

  var navArguments: Bundle? = null
}
