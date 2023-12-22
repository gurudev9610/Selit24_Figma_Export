package com.guruprasadsapplication.app.modules.aboutapplication.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityAboutApplicationBinding
import com.guruprasadsapplication.app.modules.aboutapplication.`data`.viewmodel.AboutApplicationVM
import kotlin.String
import kotlin.Unit

class AboutApplicationActivity :
    BaseActivity<ActivityAboutApplicationBinding>(R.layout.activity_about_application) {
  private val viewModel: AboutApplicationVM by viewModels<AboutApplicationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutApplicationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ABOUT_APPLICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutApplicationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
