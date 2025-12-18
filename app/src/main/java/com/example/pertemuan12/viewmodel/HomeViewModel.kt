package com.example.pertemuan12.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pertemuan12.modeldata.DataSiswa
import com.example.pertemuan12.repositori.RepositoryDataSiswa
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

/**
 * Sealed interface untuk merepresentasikan berbagai status UI pada halaman Home.
 */
sealed interface UIStateHome {
    data class Success(val siswa: List<DataSiswa>) : UIStateHome
    object Error : UIStateHome
    object Loading : UIStateHome
}

class HomeViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) : ViewModel() {

    // State yang menampung status data untuk ditampilkan di UI
    var siswaUIState: UIStateHome by mutableStateOf(UIStateHome.Loading)
        private set

    init {
        getSiswa()
    }

    /**
     * Fungsi untuk mengambil daftar data siswa dari repositori.
     */
    fun getSiswa() {
        viewModelScope.launch {
            siswaUIState = UIStateHome.Loading
            siswaUIState = try {
                // Mengambil data dari database melalui repositori
                UIStateHome.Success(repositoryDataSiswa.getDataSiswa())
            } catch (e: IOException) {
                // Terjadi masalah jaringan
                UIStateHome.Error
            } catch (e: HttpException) {
                // Terjadi masalah pada respon server (misal: 404 atau 500)
                UIStateHome.Error
            }
        }
    }
}