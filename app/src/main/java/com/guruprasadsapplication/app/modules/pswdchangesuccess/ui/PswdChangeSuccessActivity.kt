package com.guruprasadsapplication.app.modules.pswdchangesuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityPswdChangeSuccessBinding
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.pswdchangesuccess.`data`.viewmodel.PswdChangeSuccessVM
import kotlin.String
import kotlin.Unit

class PswdChangeSuccessActivity :
    BaseActivity<ActivityPswdChangeSuccessBinding>(R.layout.activity_pswd_change_success) {
  private val viewModel: PswdChangeSuccessVM by viewModels<PswdChangeSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pswdChangeSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSuccessfullyDo.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PSWD_CHANGE_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PswdChangeSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
