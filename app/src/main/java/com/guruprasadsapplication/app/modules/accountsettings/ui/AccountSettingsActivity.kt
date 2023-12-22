package com.guruprasadsapplication.app.modules.accountsettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityAccountSettingsBinding
import com.guruprasadsapplication.app.modules.accountdelete.ui.AccountDeleteActivity
import com.guruprasadsapplication.app.modules.accountsettings.`data`.viewmodel.AccountSettingsVM
import com.guruprasadsapplication.app.modules.changepassword.ui.ChangePasswordActivity
import com.guruprasadsapplication.app.modules.editprofile.ui.EditProfileActivity
import kotlin.String
import kotlin.Unit

class AccountSettingsActivity :
    BaseActivity<ActivityAccountSettingsBinding>(R.layout.activity_account_settings) {
  private val viewModel: AccountSettingsVM by viewModels<AccountSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowrightTwo.setOnClickListener {
      val destIntent = AccountDeleteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowrightOne.setOnClickListener {
      val destIntent = ChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
