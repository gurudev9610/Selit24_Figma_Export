package com.guruprasadsapplication.app.modules.myads.ui

import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityMyAdsBinding
import com.guruprasadsapplication.app.modules.myads.`data`.viewmodel.MyAdsVM
import kotlin.String
import kotlin.Unit

class MyAdsActivity : BaseActivity<ActivityMyAdsBinding>(R.layout.activity_my_ads) {
  private val viewModel: MyAdsVM by viewModels<MyAdsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myAdsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MY_ADS_ACTIVITY"

  }
}
