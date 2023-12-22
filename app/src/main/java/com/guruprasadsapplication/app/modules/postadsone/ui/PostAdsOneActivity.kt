package com.guruprasadsapplication.app.modules.postadsone.ui

import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityPostAdsOneBinding
import com.guruprasadsapplication.app.modules.postadsone.`data`.viewmodel.PostAdsOneVM
import kotlin.String
import kotlin.Unit

class PostAdsOneActivity : BaseActivity<ActivityPostAdsOneBinding>(R.layout.activity_post_ads_one) {
  private val viewModel: PostAdsOneVM by viewModels<PostAdsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.postAdsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POST_ADS_ONE_ACTIVITY"

  }
}
