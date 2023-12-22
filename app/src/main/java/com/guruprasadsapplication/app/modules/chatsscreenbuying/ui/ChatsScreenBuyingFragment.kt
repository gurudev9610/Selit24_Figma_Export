package com.guruprasadsapplication.app.modules.chatsscreenbuying.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseFragment
import com.guruprasadsapplication.app.databinding.FragmentChatsScreenBuyingBinding
import com.guruprasadsapplication.app.modules.chatsscreenbuying.`data`.viewmodel.ChatsScreenBuyingVM
import kotlin.String
import kotlin.Unit

class ChatsScreenBuyingFragment :
    BaseFragment<FragmentChatsScreenBuyingBinding>(R.layout.fragment_chats_screen_buying) {
  private val viewModel: ChatsScreenBuyingVM by viewModels<ChatsScreenBuyingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.chatsScreenBuyingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHATS_SCREEN_BUYING_FRAGMENT"


    fun getInstance(bundle: Bundle?): ChatsScreenBuyingFragment {
      val fragment = ChatsScreenBuyingFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
