package com.guruprasadsapplication.app.modules.forgetpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityForgetPasswordBinding
import com.guruprasadsapplication.app.modules.forgetpassword.`data`.viewmodel.ForgetPasswordVM
import com.guruprasadsapplication.app.modules.getemailotp.ui.GetEmailOtpActivity
import com.guruprasadsapplication.app.modules.loginwithemail.ui.LoginWithEmailActivity
import kotlin.String
import kotlin.Unit

class ForgetPasswordActivity :
    BaseActivity<ActivityForgetPasswordBinding>(R.layout.activity_forget_password) {
  private val viewModel: ForgetPasswordVM by viewModels<ForgetPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackbtn.setOnClickListener {
      val destIntent = LoginWithEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = GetEmailOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
