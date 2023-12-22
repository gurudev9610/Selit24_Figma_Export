package com.guruprasadsapplication.app.modules.postads.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.postads.`data`.model.PostAdsModel
import org.koin.core.KoinComponent

class PostAdsVM : ViewModel(), KoinComponent {
  val postAdsModel: MutableLiveData<PostAdsModel> = MutableLiveData(PostAdsModel())

  var navArguments: Bundle? = null
}
