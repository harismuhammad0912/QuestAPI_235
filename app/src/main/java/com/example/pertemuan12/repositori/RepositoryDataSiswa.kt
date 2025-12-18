package com.example.pertemuan12.repositori

import com.example.pertemuan12.apiservice.ServiceApiSiswa
import com.example.pertemuan12.modeldata.DataSiswa
import retrofit2.Response

/**
 * Interface RepositoryDataSiswa menentukan kontrak untuk pengambilan data.
 */
interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun insertDataSiswa(dataSiswa: DataSiswa): Response<Void>
}

/**
 * JaringanRepositoryDataSiswa mengimplementasikan interface menggunakan ServiceApiSiswa.
 */
class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {

    // Mengambil data siswa dari API
    override suspend fun getDataSiswa(): List<DataSiswa> =
        serviceApiSiswa.getDataSiswa()

    // Mengirim data siswa baru ke API
    override suspend fun insertDataSiswa(dataSiswa: DataSiswa): Response<Void> =
        serviceApiSiswa.insertDataSiswa(dataSiswa)
}