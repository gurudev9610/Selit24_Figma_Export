package com.guruprasadsapplication.app.modules.privacypolicy.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PrivacyPolicyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
