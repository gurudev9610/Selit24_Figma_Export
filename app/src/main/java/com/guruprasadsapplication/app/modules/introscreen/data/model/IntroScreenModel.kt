package com.guruprasadsapplication.app.modules.introscreen.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IntroScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelitTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndiasleading: String? =
      MyApp.getInstance().resources.getString(R.string.msg_india_s_leading)

)
