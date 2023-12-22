package com.guruprasadsapplication.app.modules.helpsupport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityHelpSupportBinding
import com.guruprasadsapplication.app.modules.helpsupport.`data`.viewmodel.HelpSupportVM
import kotlin.String
import kotlin.Unit

class HelpSupportActivity : BaseActivity<ActivityHelpSupportBinding>(R.layout.activity_help_support)
    {
  private val viewModel: HelpSupportVM by viewModels<HelpSupportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.helpSupportVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HELP_SUPPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HelpSupportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
