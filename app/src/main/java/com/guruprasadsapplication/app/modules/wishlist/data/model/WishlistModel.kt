package com.guruprasadsapplication.app.modules.wishlist.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WishlistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWishlist: String? = MyApp.getInstance().resources.getString(R.string.lbl_wishlist)

)
