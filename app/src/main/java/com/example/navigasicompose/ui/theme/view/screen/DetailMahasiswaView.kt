package com.example.navigasicompose.ui.theme.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigasicompose.data.MataKuliah
import com.example.navigasicompose.model.Mahasiswa
import com.example.navigasicompose.model.RencanaStudi

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    DataKRS:RencanaStudi,
    onClickButton: () -> Unit
){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Email", dataMhs.email),
        Pair("NIM", dataMhs.nim),
    )
    val listDataKRS = listOf(
        Pair("Mata Kuliah",  DataKRS.Matakuliah),
        Pair("Kelas", DataKRS.kelas)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        listDataMhs.forEach { data -> DetailMhs(judul = data.first, isinya = data.second)
        }
        listDataKRS.forEach { data ->
            DetailMhs(judul = data.first, isinya = data.second)
        }
        Button(
            onClick = {onClickButton()},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("Kembali")
        }
    }
}

@Composable
fun DetailMhs(judul: String, isinya: String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Text(text = judul, modifier = Modifier.weight(0.8f))
        Text(text = ":", modifier = Modifier.weight(0.2f))
        Text(text = isinya, modifier = Modifier.weight(2f))
    }
}