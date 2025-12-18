package com.example.pertemuan12.uicontroller.route

import com.example.pertemuan12.R

/**
 * DestinasiHome mendefinisikan rute untuk halaman utama aplikasi.
 * Objek ini mengimplementasikan interface DestinasiNavigasi.
 */
object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}