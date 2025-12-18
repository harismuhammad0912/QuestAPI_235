package com.example.pertemuan12.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan12.modeldata.DetailSiswa
import com.example.pertemuan12.modeldata.UIStateSiswa
import com.example.pertemuan12.modeldata.toDataSiswa
import com.example.pertemuan12.repositori.RepositoryDataSiswa

class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) : ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    fun updateUiState(detailSiswa: DetailSiswa) {
        uiStateSiswa = UIStateSiswa(
            detailSiswa = detailSiswa,
            isEntryValid = detailSiswa.nama.isNotBlank() && detailSiswa.alamat.isNotBlank() && detailSiswa.telpon.isNotBlank()
        )
    }

    suspend fun addSiswa() {
        if (uiStateSiswa.isEntryValid) {
            repositoryDataSiswa.insertDataSiswa(uiStateSiswa.detailSiswa.toDataSiswa())
        }
    }
}