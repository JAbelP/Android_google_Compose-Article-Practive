package com.example.composearticlepractive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticlepractive.ui.theme.ComposeArticlePractiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticlePractiveTheme {



                    textChunk()



            }
        }
    }
}




@Composable
fun textChunk(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)


    Column {
        Image(painter = image, null)
        Text(
            stringResource(R.string.first_text),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            stringResource(R.string.second_text),
            modifier = Modifier.padding(16.dp)
        )

        Text(
            stringResource(R.string.third_text),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun textChunkPreview( ){
    ComposeArticlePractiveTheme() {
        textChunk(modifier = Modifier.fillMaxSize())
    }
}