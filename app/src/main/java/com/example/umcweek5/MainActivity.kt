package com.example.umcweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

const val binding=R.layout.activity_main

class MainActivity : YouTubeBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

private fun initYoutubePlayer(key: String) {
    val youtubeView = binding.youtubePlayerView

    youtubeView.initialize("develop", object : YouTubePlayer.OnInitializedListener {
        override fun onInitializationSuccess(p0: YouTubePlayer.Provider, p1: YouTubePlayer, p2: Boolean ) {
            if (!p2) {
                p1.cueVideo(key)
            }
        }

        override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult? ) {
        }
    })
}