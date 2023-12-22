package com.guruprasadsapplication.app.modules.homescreen.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelitTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrowseCategori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_browse_categori)

)
