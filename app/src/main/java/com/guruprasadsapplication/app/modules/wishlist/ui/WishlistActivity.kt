package com.guruprasadsapplication.app.modules.wishlist.ui

import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityWishlistBinding
import com.guruprasadsapplication.app.modules.wishlist.`data`.viewmodel.WishlistVM
import kotlin.String
import kotlin.Unit

class WishlistActivity : BaseActivity<ActivityWishlistBinding>(R.layout.activity_wishlist) {
  private val viewModel: WishlistVM by viewModels<WishlistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.wishlistVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WISHLIST_ACTIVITY"

  }
}
