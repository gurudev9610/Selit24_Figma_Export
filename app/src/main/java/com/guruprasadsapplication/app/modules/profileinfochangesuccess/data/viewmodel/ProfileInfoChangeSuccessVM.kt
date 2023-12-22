package com.guruprasadsapplication.app.modules.profileinfochangesuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.profileinfochangesuccess.`data`.model.ProfileInfoChangeSuccessModel
import org.koin.core.KoinComponent

class ProfileInfoChangeSuccessVM : ViewModel(), KoinComponent {
  val profileInfoChangeSuccessModel: MutableLiveData<ProfileInfoChangeSuccessModel> =
      MutableLiveData(ProfileInfoChangeSuccessModel())

  var navArguments: Bundle? = null
}
