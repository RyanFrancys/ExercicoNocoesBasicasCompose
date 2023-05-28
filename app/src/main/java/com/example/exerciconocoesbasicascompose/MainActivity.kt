    package com.example.exerciconocoesbasicascompose

import android.os.Bundle
import android.widget.ScrollView
import android.widget.Scroller
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciconocoesbasicascompose.ui.theme.ExercicoNocoesBasicasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExercicoNocoesBasicasComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EstruturaArtigo()
                }
            }
        }
    }
}
@Composable
fun EstruturaArtigo(){
    ComponentesArtigo(  titulo = stringResource(R.string.Titulo_artigo),
                        resumo = stringResource(R.string.Resumo_artigo),
                        texto = stringResource(R.string.Texto_artigo))
}
@Composable
fun ComponentesArtigo(titulo: String,resumo:String,texto:String){
    var image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = Modifier.fillMaxSize()
        ){
        Image(  painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit
        )
        Text(   textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start =  16.dp, end = 16.dp),
                text = titulo,
                fontSize = 24.sp)
        Text(   textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start =  16.dp, end = 16.dp),
                text = resumo,
                fontSize = 22.sp)
        Text(
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp),
                text = texto,
                fontSize = 20.sp)
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExercicoNocoesBasicasComposeTheme {
        EstruturaArtigo()
    }
}