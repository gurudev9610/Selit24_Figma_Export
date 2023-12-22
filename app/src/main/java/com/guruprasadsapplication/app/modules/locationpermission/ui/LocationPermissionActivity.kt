package com.guruprasadsapplication.app.modules.locationpermission.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLocationPermissionBinding
import com.guruprasadsapplication.app.modules.homescreencontainer.ui.HomeScreenContainerActivity
import com.guruprasadsapplication.app.modules.locationpermission.`data`.viewmodel.LocationPermissionVM
import kotlin.String
import kotlin.Unit

class LocationPermissionActivity :
    BaseActivity<ActivityLocationPermissionBinding>(R.layout.activity_location_permission) {
  private val viewModel: LocationPermissionVM by viewModels<LocationPermissionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationPermissionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSelit241.setOnClickListener {
      val destIntent = HomeScreenContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOCATION_PERMISSION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LocationPermissionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
