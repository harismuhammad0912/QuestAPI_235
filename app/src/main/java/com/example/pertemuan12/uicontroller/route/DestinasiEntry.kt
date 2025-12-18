package com.example.pertemuan12.uicontroller.route

import com.example.pertemuan12.R

/**
 * DestinasiEntry mendefinisikan rute dan judul untuk halaman input data siswa.
 * Objek ini mengimplementasikan interface DestinasiNavigasi.
 */
object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}