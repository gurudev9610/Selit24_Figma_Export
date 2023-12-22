package com.guruprasadsapplication.app.modules.changepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityChangePasswordBinding
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import com.guruprasadsapplication.app.modules.pswdchangesuccess.ui.PswdChangeSuccessActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordActivity :
    BaseActivity<ActivityChangePasswordBinding>(R.layout.activity_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameBackbtn.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = PswdChangeSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
