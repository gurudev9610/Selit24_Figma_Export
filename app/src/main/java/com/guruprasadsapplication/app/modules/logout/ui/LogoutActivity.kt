package com.guruprasadsapplication.app.modules.logout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLogoutBinding
import com.guruprasadsapplication.app.modules.loginpage.ui.LoginPageActivity
import com.guruprasadsapplication.app.modules.logout.`data`.viewmodel.LogoutVM
import kotlin.String
import kotlin.Unit

class LogoutActivity : BaseActivity<ActivityLogoutBinding>(R.layout.activity_logout) {
  private val viewModel: LogoutVM by viewModels<LogoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
