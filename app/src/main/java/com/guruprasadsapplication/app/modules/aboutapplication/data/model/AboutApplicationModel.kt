package com.guruprasadsapplication.app.modules.aboutapplication.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AboutApplicationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutApplicati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_about_applicati)

)
