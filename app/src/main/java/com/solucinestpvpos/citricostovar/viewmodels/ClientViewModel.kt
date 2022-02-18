package com.solucinestpvpos.citricostovar.viewmodels

import androidx.lifecycle.ViewModel
import com.solucinestpvpos.citricostovar.api.ApiServices
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ClientViewModel @Inject constructor(val apiServices: ApiServices) : ViewModel(){



}