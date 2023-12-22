package com.guruprasadsapplication.app.modules.loginwithemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLoginWithEmailBinding
import com.guruprasadsapplication.app.modules.forgetpassword.ui.ForgetPasswordActivity
import com.guruprasadsapplication.app.modules.loginpage.ui.LoginPageActivity
import com.guruprasadsapplication.app.modules.loginwithemail.`data`.viewmodel.LoginWithEmailVM
import com.guruprasadsapplication.app.modules.signupwithemail.ui.SignupWithEmailActivity
import com.guruprasadsapplication.app.modules.userverify.ui.UserVerifyActivity
import kotlin.String
import kotlin.Unit

class LoginWithEmailActivity :
    BaseActivity<ActivityLoginWithEmailBinding>(R.layout.activity_login_with_email) {
  private val viewModel: LoginWithEmailVM by viewModels<LoginWithEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginWithEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackbtn.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSignup.setOnClickListener {
      val destIntent = SignupWithEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = UserVerifyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgetPassword.setOnClickListener {
      val destIntent = ForgetPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_WITH_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginWithEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
