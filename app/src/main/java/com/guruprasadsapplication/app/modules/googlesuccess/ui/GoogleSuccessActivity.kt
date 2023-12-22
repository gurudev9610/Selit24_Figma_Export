package com.guruprasadsapplication.app.modules.googlesuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityGoogleSuccessBinding
import com.guruprasadsapplication.app.modules.editprofile.ui.EditProfileActivity
import com.guruprasadsapplication.app.modules.googlesuccess.`data`.viewmodel.GoogleSuccessVM
import kotlin.String
import kotlin.Unit

class GoogleSuccessActivity :
    BaseActivity<ActivityGoogleSuccessBinding>(R.layout.activity_google_success) {
  private val viewModel: GoogleSuccessVM by viewModels<GoogleSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.googleSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGoogle.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GOOGLE_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GoogleSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
