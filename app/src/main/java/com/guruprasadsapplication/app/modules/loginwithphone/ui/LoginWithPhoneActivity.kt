package com.guruprasadsapplication.app.modules.loginwithphone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLoginWithPhoneBinding
import com.guruprasadsapplication.app.modules.getphoneotp.ui.GetPhoneOtpActivity
import com.guruprasadsapplication.app.modules.loginpage.ui.LoginPageActivity
import com.guruprasadsapplication.app.modules.loginwithphone.`data`.viewmodel.LoginWithPhoneVM
import kotlin.String
import kotlin.Unit

class LoginWithPhoneActivity :
    BaseActivity<ActivityLoginWithPhoneBinding>(R.layout.activity_login_with_phone) {
  private val viewModel: LoginWithPhoneVM by viewModels<LoginWithPhoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginWithPhoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSendOtp.setOnClickListener {
      val destIntent = GetPhoneOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackbtn.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_WITH_PHONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginWithPhoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
