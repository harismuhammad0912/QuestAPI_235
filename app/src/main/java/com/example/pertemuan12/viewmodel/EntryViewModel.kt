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
