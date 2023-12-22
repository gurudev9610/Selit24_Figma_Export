package com.guruprasadsapplication.app.modules.accountdelete.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityAccountDeleteBinding
import com.guruprasadsapplication.app.modules.accountdelete.`data`.viewmodel.AccountDeleteVM
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.deletesuccess.ui.DeleteSuccessActivity
import kotlin.String
import kotlin.Unit

class AccountDeleteActivity :
    BaseActivity<ActivityAccountDeleteBinding>(R.layout.activity_account_delete) {
  private val viewModel: AccountDeleteVM by viewModels<AccountDeleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountDeleteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = DeleteSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DELETE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountDeleteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
