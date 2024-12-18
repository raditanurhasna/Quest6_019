package com.example.navigasicompose.navigation

import RencanaStudiView
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasicompose.ui.theme.view.screen.DetailMahasiswaView
import com.example.navigasicompose.ui.theme.view.screen.SplashView
import com.example.navigasicompose.ui.theme.view.viewmodel.RencanaStudyViewModel
import com.example.navigasicompose.ui.view.screen.MahasiswaFormView
import com.example.navigasicompose.ui.view.viewmodel.MahasiswaViewModel


enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUIState.collectAsState().value
    val rencanaUiState = krsViewModel.krsStateUi.collectAsState().value
    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ){
        composable(route = Halaman.Splash.name){
            SplashView(onMulaiButton = {
                navController.navigate(
                    Halaman.Mahasiswa.name
                )
            })
        }
        composable(route = Halaman.Mahasiswa.name) {
            MahasiswaFormView(
                onSubmitButtonClicked = {
                    mahasiswaViewModel.saveDataMahasiswa(it)
                    navController.navigate(Halaman.Matakuliah.name)
                },
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Halaman.Matakuliah.name) {
            RencanaStudiView(
                mahasiswa = mahasiswaUiState,
                onSubmitButtonCliked = { krsViewModel.saveDataKRS(it) },
                onBackButtonCliked = { navController.popBackStack() }
            )
            composable(route = Halaman.Tampil.name) {
                DetailMahasiswaView(
                    dataMhs = mahasiswaUiState,
                    DataKRS = rencanaUiState,
                    onClickButton = {
                        navController.popBackStack()
                    }
                )

            }
        }
    }
}




