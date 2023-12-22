package com.guruprasadsapplication.app.modules.profileinfochangesuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityProfileInfoChangeSuccessBinding
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.profileinfochangesuccess.`data`.viewmodel.ProfileInfoChangeSuccessVM
import kotlin.String
import kotlin.Unit

class ProfileInfoChangeSuccessActivity :
    BaseActivity<ActivityProfileInfoChangeSuccessBinding>(R.layout.activity_profile_info_change_success)
    {
  private val viewModel: ProfileInfoChangeSuccessVM by viewModels<ProfileInfoChangeSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileInfoChangeSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSuccessfullyDo.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_INFO_CHANGE_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileInfoChangeSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
