package com.guruprasadsapplication.app.modules.phoneotpverify.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityPhoneOtpVerifyBinding
import com.guruprasadsapplication.app.modules.locationpermission.ui.LocationPermissionActivity
import com.guruprasadsapplication.app.modules.phoneotpverify.`data`.viewmodel.PhoneOtpVerifyVM
import kotlin.String
import kotlin.Unit

class PhoneOtpVerifyActivity :
    BaseActivity<ActivityPhoneOtpVerifyBinding>(R.layout.activity_phone_otp_verify) {
  private val viewModel: PhoneOtpVerifyVM by viewModels<PhoneOtpVerifyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.phoneOtpVerifyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSuccessfullyDo.setOnClickListener {
      val destIntent = LocationPermissionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PHONE_OTP_VERIFY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PhoneOtpVerifyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
