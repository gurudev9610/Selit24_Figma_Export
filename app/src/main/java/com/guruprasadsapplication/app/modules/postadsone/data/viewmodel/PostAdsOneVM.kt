package com.guruprasadsapplication.app.modules.postadsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.postadsone.`data`.model.PostAdsOneModel
import org.koin.core.KoinComponent

class PostAdsOneVM : ViewModel(), KoinComponent {
  val postAdsOneModel: MutableLiveData<PostAdsOneModel> = MutableLiveData(PostAdsOneModel())

  var navArguments: Bundle? = null
}
