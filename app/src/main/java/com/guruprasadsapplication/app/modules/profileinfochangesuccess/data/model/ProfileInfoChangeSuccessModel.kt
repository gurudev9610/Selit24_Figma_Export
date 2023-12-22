package com.guruprasadsapplication.app.modules.profileinfochangesuccess.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileInfoChangeSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileInforma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_informa)

)
