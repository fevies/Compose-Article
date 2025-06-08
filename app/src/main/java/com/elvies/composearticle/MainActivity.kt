package com.elvies.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
import com.elvies.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //
        setContent {
            ComposeArticleTheme {
                Surface (
                    //parent container
                    modifier = Modifier
                        .fillMaxSize(),

                    color = MaterialTheme.colorScheme.background

                ) {
                    //child container
                    ImageHeader()

                }
            }
        }
    }
}

@Composable
fun JetpackArticle(modifier: Modifier = Modifier) {
    Column (
        modifier.padding(16.dp)

    ) {
        Text(
            text = stringResource(R.string.topic),
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)


           )

        Text(
            text = stringResource(R.string.paragraph_one),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = stringResource(R.string.paragraph_two),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }

}
@Composable
fun ImageHeader (modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = "Image Header"

        )
        JetpackArticle()
    }
   

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ImageHeader()

    }
}