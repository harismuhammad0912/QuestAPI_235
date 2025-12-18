package com.example.pertemuan12.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertemuan12.R
import com.example.pertemuan12.uicontroller.route.DestinasiHome
import com.example.pertemuan12.viewmodel.HomeViewModel
import com.example.pertemuan12.viewmodel.UIStateHome
import com.example.pertemuan12.viewmodel.provider.PenyediaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit = {},
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(DestinasiHome.titleRes),
                canNavigateBack = false,
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = navigateToItemEntry) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        HomeStatus(
            homeUiState = viewModel.siswaUIState,
            retryAction = { viewModel.getSiswa() },
            onDetailClick = onDetailClick,
            modifier = Modifier.padding(innerPadding)
        )
    }
}


@Composable
fun HomeStatus(
    homeUiState: UIStateHome,
    retryAction: () -> Unit,
    onDetailClick: (Int) -> Unit,
    modifier: Modifier
) {
    TODO("Not yet implemented")
}