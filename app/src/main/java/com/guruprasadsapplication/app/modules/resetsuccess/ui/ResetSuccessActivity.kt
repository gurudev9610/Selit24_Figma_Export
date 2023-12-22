package com.guruprasadsapplication.app.modules.resetsuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityResetSuccessBinding
import com.guruprasadsapplication.app.modules.loginwithemail.ui.LoginWithEmailActivity
import com.guruprasadsapplication.app.modules.resetsuccess.`data`.viewmodel.ResetSuccessVM
import kotlin.String
import kotlin.Unit

class ResetSuccessActivity :
    BaseActivity<ActivityResetSuccessBinding>(R.layout.activity_reset_success) {
  private val viewModel: ResetSuccessVM by viewModels<ResetSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resetSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinueToLoginOne.setOnClickListener {
      val destIntent = LoginWithEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESET_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResetSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
