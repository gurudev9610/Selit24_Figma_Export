package com.guruprasadsapplication.app.modules.editprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityEditProfileBinding
import com.guruprasadsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.guruprasadsapplication.app.modules.editprofile.`data`.viewmodel.EditProfileVM
import com.guruprasadsapplication.app.modules.loginwithgoogle.ui.LoginWithGoogleActivity
import com.guruprasadsapplication.app.modules.profileinfochangesuccess.ui.ProfileInfoChangeSuccessActivity
import kotlin.String
import kotlin.Unit

class EditProfileActivity : BaseActivity<ActivityEditProfileBinding>(R.layout.activity_edit_profile)
    {
  private val viewModel: EditProfileVM by viewModels<EditProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowgoogle.setOnClickListener {
      val destIntent = LoginWithGoogleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameBackbtn.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = ProfileInfoChangeSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
