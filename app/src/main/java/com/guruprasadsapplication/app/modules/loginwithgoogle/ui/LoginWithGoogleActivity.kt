package com.guruprasadsapplication.app.modules.loginwithgoogle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLoginWithGoogleBinding
import com.guruprasadsapplication.app.modules.editprofile.ui.EditProfileActivity
import com.guruprasadsapplication.app.modules.googleaccallow.ui.GoogleAccAllowActivity
import com.guruprasadsapplication.app.modules.loginwithgoogle.`data`.viewmodel.LoginWithGoogleVM
import kotlin.String
import kotlin.Unit

class LoginWithGoogleActivity :
    BaseActivity<ActivityLoginWithGoogleBinding>(R.layout.activity_login_with_google) {
  private val viewModel: LoginWithGoogleVM by viewModels<LoginWithGoogleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginWithGoogleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackbtn.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGoogleacc.setOnClickListener {
      val destIntent = GoogleAccAllowActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_WITH_GOOGLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginWithGoogleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
