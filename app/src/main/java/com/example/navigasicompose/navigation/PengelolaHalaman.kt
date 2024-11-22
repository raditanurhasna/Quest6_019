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
import com.example.navigasicompose.ui.theme.view.screen.SplashView
import com.example.navigasicompose.ui.theme.view.viewmodel.MahasiswaViewModel
import com.example.navigasicompose.ui.theme.view.viewmodel.RencanaStudyViewModel
import com.example.navigasicompose.ui.view.viewmodel.MahasiswaViewModel
import com.example.project.ui.view.screen.MahasiswaFormView

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
) {}




