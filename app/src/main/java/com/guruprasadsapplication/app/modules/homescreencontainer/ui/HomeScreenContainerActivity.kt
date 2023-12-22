package com.guruprasadsapplication.app.modules.homescreencontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityHomeScreenContainerBinding
import com.guruprasadsapplication.app.extensions.loadFragment
import com.guruprasadsapplication.app.modules.chatsscreenbuying.ui.ChatsScreenBuyingFragment
import com.guruprasadsapplication.app.modules.homescreen.ui.HomeScreenFragment
import com.guruprasadsapplication.app.modules.homescreencontainer.`data`.viewmodel.HomeScreenContainerVM
import com.guruprasadsapplication.app.modules.profile.ui.ProfileFragment
import kotlin.String
import kotlin.Unit

class HomeScreenContainerActivity :
    BaseActivity<ActivityHomeScreenContainerBinding>(R.layout.activity_home_screen_container) {
  private val viewModel: HomeScreenContainerVM by viewModels<HomeScreenContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenContainerVM = viewModel
    val destFragment = HomeScreenFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = HomeScreenFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnprofile.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ProfileFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearColumnhome.setOnClickListener {
      val destFragment = HomeScreenFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HomeScreenFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearColumnchat.setOnClickListener {
      val destFragment = ChatsScreenBuyingFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ChatsScreenBuyingFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeScreenContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
