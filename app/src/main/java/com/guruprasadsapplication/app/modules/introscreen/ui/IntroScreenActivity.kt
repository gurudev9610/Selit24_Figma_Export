package com.guruprasadsapplication.app.modules.introscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityIntroScreenBinding
import com.guruprasadsapplication.app.modules.introscreen.`data`.viewmodel.IntroScreenVM
import com.guruprasadsapplication.app.modules.loginpage.ui.LoginPageActivity
import kotlin.String
import kotlin.Unit

class IntroScreenActivity : BaseActivity<ActivityIntroScreenBinding>(R.layout.activity_intro_screen)
    {
  private val viewModel: IntroScreenVM by viewModels<IntroScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTRO_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
