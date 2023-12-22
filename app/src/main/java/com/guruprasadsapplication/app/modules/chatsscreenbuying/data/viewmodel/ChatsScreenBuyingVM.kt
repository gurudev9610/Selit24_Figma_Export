package com.guruprasadsapplication.app.modules.chatsscreenbuying.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.chatsscreenbuying.`data`.model.ChatsScreenBuyingModel
import org.koin.core.KoinComponent

class ChatsScreenBuyingVM : ViewModel(), KoinComponent {
  val chatsScreenBuyingModel: MutableLiveData<ChatsScreenBuyingModel> =
      MutableLiveData(ChatsScreenBuyingModel())

  var navArguments: Bundle? = null
}
