package com.guruprasadsapplication.app.modules.helpsupport.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HelpSupportModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_support)

)
