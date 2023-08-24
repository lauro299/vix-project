package com.example.vixproject.di

import android.content.Context
import com.example.vixproject.R
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Named
import org.koin.core.annotation.Singleton
import java.io.BufferedReader

@Module
@ComponentScan("com.example.vixproject")
class AppModule


@Singleton()
@Named("jsonString")
fun getJsonString(context: Context): String {
    return context.resources.openRawResource(R.raw.inicio)
                        .use {
                            val reader = BufferedReader(it.reader())
                            val content = StringBuilder()
                            var line = reader.readLine()
                            while (line != null) {
                                content.append(line)
                                line = reader.readLine()
                            }
                            content.toString()
                        }
}