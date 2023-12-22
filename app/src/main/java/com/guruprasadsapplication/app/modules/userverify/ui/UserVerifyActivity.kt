package com.guruprasadsapplication.app.modules.userverify.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityUserVerifyBinding
import com.guruprasadsapplication.app.modules.userverify.`data`.viewmodel.UserVerifyVM
import kotlin.String
import kotlin.Unit

class UserVerifyActivity : BaseActivity<ActivityUserVerifyBinding>(R.layout.activity_user_verify) {
  private val viewModel: UserVerifyVM by viewModels<UserVerifyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userVerifyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "USER_VERIFY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserVerifyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
