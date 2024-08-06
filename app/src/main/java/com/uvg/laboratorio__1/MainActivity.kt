//UNIVERSIDAD DEL VALLE DE GUATEMALA
//DEPARTAMENTO DE INGENIERIA
//PROGRAMACIÓN DE PLATAFORMAS MÓVILES
//CARLOS ALBUREZ - 231311

package com.uvg.laboratorio__1

import android.graphics.fonts.Font
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio__1.ui.theme.Laboratorio__1Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mainscreen()
        }
    }
}


@Composable
fun Mainscreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Bienvenido",
            color = Color.Cyan,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center, modifier = Modifier.width(500.dp),
            fontFamily = FontFamily.Cursive,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.displaySmall
            )
        Text(text = "Mario",
            color = Color.DarkGray,
            fontSize = 45.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center, modifier = Modifier.width(500.dp),
            fontFamily = FontFamily.Serif,
            overflow = TextOverflow.Ellipsis
            )
        Text(text = "Excelente día",
            color = Color.Blue,
            fontSize =35.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center, modifier = Modifier.width(500.dp),
            fontFamily = FontFamily.Cursive
            )

        Button(onClick = {
            Log.d("Mainscreen", "Apretame fue presionado, GOAT")
        }) {
            Text(text = "¡Presioname!")

        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun Greeting(){
    Mainscreen()
}