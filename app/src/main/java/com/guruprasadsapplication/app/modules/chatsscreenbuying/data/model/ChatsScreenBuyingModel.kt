package com.guruprasadsapplication.app.modules.chatsscreenbuying.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsScreenBuyingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuying: String? = MyApp.getInstance().resources.getString(R.string.lbl_buying)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelling: String? = MyApp.getInstance().resources.getString(R.string.lbl_selling)

)
