package com.guruprasadsapplication.app.modules.location.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityLocationBinding
import com.guruprasadsapplication.app.modules.location.`data`.viewmodel.LocationVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class LocationActivity : BaseActivity<ActivityLocationBinding>(R.layout.activity_location) {
  private val viewModel: LocationVM by viewModels<LocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationVM = viewModel
    setUpSearchViewGroupTwentyTwoListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewGroupTwentyTwoListener(): Unit {
    binding.searchViewGroupTwentyTwo.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "LOCATION_ACTIVITY"

    }
  }
