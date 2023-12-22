package com.guruprasadsapplication.app.modules.deletesuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.base.BaseActivity
import com.guruprasadsapplication.app.databinding.ActivityDeleteSuccessBinding
import com.guruprasadsapplication.app.modules.deletesuccess.`data`.viewmodel.DeleteSuccessVM
import com.guruprasadsapplication.app.modules.loginpage.ui.LoginPageActivity
import kotlin.String
import kotlin.Unit

class DeleteSuccessActivity :
    BaseActivity<ActivityDeleteSuccessBinding>(R.layout.activity_delete_success) {
  private val viewModel: DeleteSuccessVM by viewModels<DeleteSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.deleteSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSuccessfullyDo.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DELETE_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DeleteSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
