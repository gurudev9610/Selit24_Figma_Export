package com.guruprasadsapplication.app.modules.acccreated.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccCreatedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountCreated: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_created)

)
