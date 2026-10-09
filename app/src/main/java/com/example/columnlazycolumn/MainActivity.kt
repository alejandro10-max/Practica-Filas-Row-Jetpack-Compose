package com.example.columnlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiInterfaz()
        }
    }
}

@Composable
fun MiInterfaz() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.practica),
                contentDescription = "Imagen de la práctica",
                modifier = Modifier.size(150.dp)
            )
        }

        item {
            Text(
                text = "AMOR PELIGROSO",
                fontSize = 28.sp,
                color = Color.White
            )
        }

        item {
            Text(
                text = "20/07/2026",
                fontSize = 20.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "JUNTOS X SIEMPRE",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "BODA PROXIMO AÑO",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "Java",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "C++",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "Kotlin",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "PHP",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "PHP",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "PHP",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        item {
            Text(
                text = "PHP",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    MiInterfaz()
}