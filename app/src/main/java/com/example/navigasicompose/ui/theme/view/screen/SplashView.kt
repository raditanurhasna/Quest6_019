package com.example.navigasicompose.ui.theme.view.screen

import android.widget.Button
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.navigasicompose.R

@Composable
fun SplashView(
    onMulaiButton: () -> Unit,
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
      Image(
          painter = painterResource(
              id = R.drawable.logoumy
          ),
          contentDescription = "",
          modifier = Modifier.size(150.dp)
      )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onMulaiButton()
                         }
        ) {
            Text(text = "Mulai")
        }
    }
}
