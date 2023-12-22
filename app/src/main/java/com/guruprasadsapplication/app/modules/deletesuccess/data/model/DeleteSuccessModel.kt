package com.guruprasadsapplication.app.modules.deletesuccess.`data`.model

import com.guruprasadsapplication.app.R
import com.guruprasadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeleteSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountDeleted: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_deleted)

)
