package com.guruprasadsapplication.app.modules.accountdelete.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.accountdelete.`data`.model.AccountDeleteModel
import org.koin.core.KoinComponent

class AccountDeleteVM : ViewModel(), KoinComponent {
  val accountDeleteModel: MutableLiveData<AccountDeleteModel> =
      MutableLiveData(AccountDeleteModel())

  var navArguments: Bundle? = null
}
