package com.guruprasadsapplication.app.modules.homescreen.ui

import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseFragment
import com.guruprasadsapplication.app.databinding.FragmentHomeScreenBinding
import com.guruprasadsapplication.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>(R.layout.fragment_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homeScreenVM = viewModel
    setUpSearchViewGroupTwentyOneListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewGroupTwentyOneListener(): Unit {
    binding.searchViewGroupTwentyOne.setOnQueryTextListener(object :
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
      const val TAG: String = "HOME_SCREEN_FRAGMENT"


      fun getInstance(bundle: Bundle?): HomeScreenFragment {
        val fragment = HomeScreenFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
