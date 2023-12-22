package com.guruprasadsapplication.app.modules.locationpermission.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guruprasadsapplication.app.modules.locationpermission.`data`.model.LocationPermissionModel
import org.koin.core.KoinComponent

class LocationPermissionVM : ViewModel(), KoinComponent {
  val locationPermissionModel: MutableLiveData<LocationPermissionModel> =
      MutableLiveData(LocationPermissionModel())

  var navArguments: Bundle? = null
}
