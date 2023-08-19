package com.example.vixproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                            navController.navigate("main")
                        }
                    }
                    composable("main") {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            MainComponent {
                                navController.navigate("detail/${it.id}")
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
                            DetailComponent(id = it.arguments?.getString("videoId") ?: ""){
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