package com.guruprasadsapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.appcomponents.googleauth.GoogleHelper
import com.guruprasadsapplication.app.databinding.ActivityLoginPageBinding
import com.guruprasadsapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.guruprasadsapplication.app.modules.loginwithemail.ui.LoginWithEmailActivity
import com.guruprasadsapplication.app.modules.loginwithphone.ui.LoginWithPhoneActivity
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearPhone.setOnClickListener {
        val destIntent = LoginWithPhoneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.linearEmail.setOnClickListener {
        val destIntent = LoginWithEmailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
