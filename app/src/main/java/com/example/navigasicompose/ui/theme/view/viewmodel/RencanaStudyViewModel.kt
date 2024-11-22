package com.example.navigasicompose.ui.theme.view.viewmodel

import com.example.navigasicompose.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi : StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String){
        _krsState.update { stateMk -> stateMk.copy(matakuliah = mkPilihan) }
    }

}