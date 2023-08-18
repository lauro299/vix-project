package com.example.vixproject.splash.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.media3.common.Player.Listener
import com.example.vixproject.R
import io.sanghun.compose.video.RepeatMode
import io.sanghun.compose.video.VideoPlayer
import io.sanghun.compose.video.uri.VideoPlayerMediaItem

@Composable
fun SplashComponent(
    goToMain:()-> Unit = { },
) {
    VideoPlayer(
        mediaItems = listOf(VideoPlayerMediaItem.RawResourceMediaItem(R.raw.vix_intro)),
        handleLifecycle = true,
        autoPlay = true,
        usePlayerController = false,
        volume = 0.5f,
        repeatMode = RepeatMode.NONE,
        modifier = Modifier.fillMaxSize(),
        playerInstance = {
            addListener(object: Listener {
                override fun onPlaybackStateChanged(playbackState: Int) {
                    if (playbackState == 4) {
                        goToMain()
                    }
                }
            })
        }
    )
}

