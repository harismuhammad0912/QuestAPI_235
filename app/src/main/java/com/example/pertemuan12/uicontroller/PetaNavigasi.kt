package com.example.pertemuan12.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan12.uicontroller.route.DestinasiHome
import com.example.pertemuan12.uicontroller.route.DestinasiEntry
import com.example.pertemuan12.view.EntrySiswaScreen
import com.example.pertemuan12.view.HomeScreen

/**
 * PetaNavigasi (HostNavigasi) mengatur rute navigasi antar layar di aplikasi.
 */
@Composable
fun PetaNavigasi(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        // Rute untuk Halaman Utama (Home)
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                onDetailClick = {
                    // Implementasi detail jika diperlukan nanti
                }
            )
        }

        // Rute untuk Halaman Tambah Data (Entry)
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}