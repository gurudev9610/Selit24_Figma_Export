package com.guruprasadsapplication.app.modules.postads.ui

import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityPostAdsBinding
import com.guruprasadsapplication.app.modules.homescreencontainer.ui.HomeScreenContainerActivity
import com.guruprasadsapplication.app.modules.postads.`data`.viewmodel.PostAdsVM
import kotlin.String
import kotlin.Unit

class PostAdsActivity : BaseActivity<ActivityPostAdsBinding>(R.layout.activity_post_ads) {
  private val viewModel: PostAdsVM by viewModels<PostAdsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.postAdsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackbtn.setOnClickListener {
      val destIntent = HomeScreenContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POST_ADS_ACTIVITY"

  }
}
