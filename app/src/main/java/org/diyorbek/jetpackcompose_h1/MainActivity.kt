package org.diyorbek.jetpackcompose_h1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.diyorbek.jetpackcompose_h1.ui.theme.JetpackComposeH1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeH1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeworkUi()
                }
            }
        }
    }
}

@Composable
fun FirstUi() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello", fontSize = 25.sp, color = Color.Blue)
        Text(text = "Diyorbek", fontSize = 30.sp, color = Color.Red)
    }

}

@Composable
fun HomeworkUi() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Button(
            onClick = {

            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan,contentColor = Color.White)
        ) {
            Text(text = "Username")
        }
        Button(
            onClick = {

            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan,contentColor = Color.White)
        ) {
            Text(text = "Password")
        }
        Row(

        ) {
            val checkedState = remember { mutableStateOf(true) }
            Checkbox(checked = true, onCheckedChange = { checkedState.value = it })
            Text(text = "Remember me")
        }
        Button(
            onClick = {

            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan,contentColor = Color.White)
        ) {
            Text(text = "Sign In")
        }
        Text(text = "Forgot password?", color = Color.Cyan)
    }

}

@Preview(showBackground = true)
@Composable
fun FirstUiPreview() {
    HomeworkUi()
}

