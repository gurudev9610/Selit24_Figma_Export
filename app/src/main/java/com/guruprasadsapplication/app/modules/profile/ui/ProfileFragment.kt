package com.guruprasadsapplication.app.modules.profile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseFragment
import com.guruprasadsapplication.app.databinding.FragmentProfileBinding
import com.guruprasadsapplication.app.modules.aboutapplication.ui.AboutApplicationActivity
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.helpsupport.ui.HelpSupportActivity
import com.guruprasadsapplication.app.modules.logout.ui.LogoutActivity
import com.guruprasadsapplication.app.modules.privacypolicy.ui.PrivacyPolicyActivity
import com.guruprasadsapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogout.setOnClickListener {
      val destIntent = LogoutActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowarrowrightThree.setOnClickListener {
      val destIntent = HelpSupportActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowarrowrightOne.setOnClickListener {
      val destIntent = PrivacyPolicyActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowarrowrightTwo.setOnClickListener {
      val destIntent = AboutApplicationActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
