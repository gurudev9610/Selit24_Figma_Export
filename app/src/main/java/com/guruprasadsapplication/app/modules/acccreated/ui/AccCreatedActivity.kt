package com.guruprasadsapplication.app.modules.acccreated.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityAccCreatedBinding
import com.guruprasadsapplication.app.modules.acccreated.`data`.viewmodel.AccCreatedVM
import com.guruprasadsapplication.app.modules.locationpermission.ui.LocationPermissionActivity
import kotlin.String
import kotlin.Unit

class AccCreatedActivity : BaseActivity<ActivityAccCreatedBinding>(R.layout.activity_acc_created) {
  private val viewModel: AccCreatedVM by viewModels<AccCreatedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accCreatedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRocket.setOnClickListener {
      val destIntent = LocationPermissionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACC_CREATED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccCreatedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
