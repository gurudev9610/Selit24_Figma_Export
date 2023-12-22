package com.guruprasadsapplication.app.modules.postadsone.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PostAdsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_category)

)
