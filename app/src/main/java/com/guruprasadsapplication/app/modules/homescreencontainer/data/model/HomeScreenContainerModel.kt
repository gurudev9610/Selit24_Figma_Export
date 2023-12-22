package com.guruprasadsapplication.app.modules.homescreencontainer.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChats: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyAdsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_ads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
