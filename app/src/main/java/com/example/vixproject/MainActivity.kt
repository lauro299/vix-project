package com.example.vixproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vixproject.main.ui.MainComponent
import com.example.vixproject.main.ui.detail.DetailComponent
import com.example.vixproject.splash.ui.SplashComponent
import com.example.vixproject.ui.theme.VixProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            VixProjectTheme {
                // A surface container using the 'background' color from the theme
                NavHost(navController = navController, startDestination = "splash") {
                    composable("splash") {
                        SplashComponent {
                            navController.navigate("main") {
                                popUpTo("splash") {
                                    inclusive = true
                                }
                            }
                        }
                    }
                    composable("main") {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            var showEmptyId by remember { mutableStateOf(false) }
                            MainComponent {
                                if (it.id.isEmpty()){
                                    showEmptyId = true
                                    return@MainComponent
                                }
                                navController.navigate("detail/${it.id}")
                            }
                            if(showEmptyId){
                                Toast.makeText(this@MainActivity, stringResource(R.string.label_not_available), Toast.LENGTH_SHORT).show()
                                showEmptyId = false
                                //showEmptyId = false
                            }
                        }
                    }
                    composable(
                        "detail/{videoId}",
                        arguments = listOf(navArgument("videoId") { type = NavType.StringType })
                    ) {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            DetailComponent(id = it.arguments?.getString("videoId") ?: "") {
                                navController.popBackStack()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VixProjectTheme {
        Greeting("Android")
    }
}