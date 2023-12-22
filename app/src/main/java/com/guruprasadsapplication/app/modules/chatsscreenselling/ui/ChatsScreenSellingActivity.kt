package com.guruprasadsapplication.app.modules.chatsscreenselling.ui

import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityChatsScreenSellingBinding
import com.guruprasadsapplication.app.modules.chatsscreenselling.`data`.viewmodel.ChatsScreenSellingVM
import kotlin.String
import kotlin.Unit

class ChatsScreenSellingActivity :
    BaseActivity<ActivityChatsScreenSellingBinding>(R.layout.activity_chats_screen_selling) {
  private val viewModel: ChatsScreenSellingVM by viewModels<ChatsScreenSellingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatsScreenSellingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHATS_SCREEN_SELLING_ACTIVITY"

  }
}
