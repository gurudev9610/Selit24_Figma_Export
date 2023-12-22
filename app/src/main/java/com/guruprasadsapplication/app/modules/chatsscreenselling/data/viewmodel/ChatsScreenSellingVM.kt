package com.guruprasadsapplication.app.modules.chatsscreenselling.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.chatsscreenselling.`data`.model.ChatsScreenSellingModel
import org.koin.core.KoinComponent

class ChatsScreenSellingVM : ViewModel(), KoinComponent {
  val chatsScreenSellingModel: MutableLiveData<ChatsScreenSellingModel> =
      MutableLiveData(ChatsScreenSellingModel())

  var navArguments: Bundle? = null
}
