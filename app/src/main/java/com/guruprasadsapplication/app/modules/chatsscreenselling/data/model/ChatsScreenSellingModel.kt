package com.guruprasadsapplication.app.modules.chatsscreenselling.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsScreenSellingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_selit24)
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
  ,
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
