package com.guruprasadsapplication.app.modules.googleaccallow.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityGoogleAccAllowBinding
import com.guruprasadsapplication.app.modules.googleaccallow.`data`.viewmodel.GoogleAccAllowVM
import com.guruprasadsapplication.app.modules.googlesuccess.ui.GoogleSuccessActivity
import com.guruprasadsapplication.app.modules.loginwithgoogle.ui.LoginWithGoogleActivity
import kotlin.String
import kotlin.Unit

class GoogleAccAllowActivity :
    BaseActivity<ActivityGoogleAccAllowBinding>(R.layout.activity_google_acc_allow) {
  private val viewModel: GoogleAccAllowVM by viewModels<GoogleAccAllowVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.googleAccAllowVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackbtn.setOnClickListener {
      val destIntent = LoginWithGoogleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageAccPermission.setOnClickListener {
      val destIntent = GoogleSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GOOGLE_ACC_ALLOW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GoogleAccAllowActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
