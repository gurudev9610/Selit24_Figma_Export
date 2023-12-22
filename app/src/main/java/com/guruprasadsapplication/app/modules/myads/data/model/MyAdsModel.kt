package com.guruprasadsapplication.app.modules.myads.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyAdsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)

)
