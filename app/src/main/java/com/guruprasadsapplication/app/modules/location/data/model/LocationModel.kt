package com.guruprasadsapplication.app.modules.location.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsecurrentloc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_current_loc)

)
