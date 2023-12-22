package com.guruprasadsapplication.app.modules.wishlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.wishlist.`data`.model.WishlistModel
import org.koin.core.KoinComponent

class WishlistVM : ViewModel(), KoinComponent {
  val wishlistModel: MutableLiveData<WishlistModel> = MutableLiveData(WishlistModel())

  var navArguments: Bundle? = null
}
