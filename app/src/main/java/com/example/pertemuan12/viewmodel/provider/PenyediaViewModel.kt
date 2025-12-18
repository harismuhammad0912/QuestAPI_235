package com.example.pertemuan12.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan12.repositori.AplikasiDataSiswa
import com.example.pertemuan12.viewmodel.EntryViewModel
import com.example.pertemuan12.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(pertemuan12Application().container.repositoryDataSiswa)
        }
        initializer {
            EntryViewModel(pertemuan12Application().container.repositoryDataSiswa)
        }
    }
}

fun CreationExtras.pertemuan12Application(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa)