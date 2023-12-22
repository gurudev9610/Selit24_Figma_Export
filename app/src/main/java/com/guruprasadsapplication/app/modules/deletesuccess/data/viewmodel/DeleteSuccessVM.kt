package com.guruprasadsapplication.app.modules.deletesuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.deletesuccess.`data`.model.DeleteSuccessModel
import org.koin.core.KoinComponent

class DeleteSuccessVM : ViewModel(), KoinComponent {
  val deleteSuccessModel: MutableLiveData<DeleteSuccessModel> =
      MutableLiveData(DeleteSuccessModel())

  var navArguments: Bundle? = null
}
