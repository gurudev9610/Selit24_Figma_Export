package com.guruprasadsapplication.app.modules.signupwithemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivitySignupWithEmailBinding
import com.guruprasadsapplication.app.modules.acccreated.ui.AccCreatedActivity
import com.guruprasadsapplication.app.modules.loginwithemail.ui.LoginWithEmailActivity
import com.guruprasadsapplication.app.modules.signupwithemail.`data`.viewmodel.SignupWithEmailVM
import kotlin.String
import kotlin.Unit

class SignupWithEmailActivity :
    BaseActivity<ActivitySignupWithEmailBinding>(R.layout.activity_signup_with_email) {
  private val viewModel: SignupWithEmailVM by viewModels<SignupWithEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupWithEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignup.setOnClickListener {
      val destIntent = AccCreatedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackbtn.setOnClickListener {
      val destIntent = LoginWithEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_WITH_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupWithEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
