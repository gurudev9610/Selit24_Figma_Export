package com.guruprasadsapplication.app.modules.splashscreen.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelitTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)

)
