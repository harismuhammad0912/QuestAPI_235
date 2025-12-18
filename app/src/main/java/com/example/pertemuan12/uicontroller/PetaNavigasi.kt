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
