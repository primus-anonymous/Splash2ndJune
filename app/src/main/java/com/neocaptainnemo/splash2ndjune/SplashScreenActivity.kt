package com.neocaptainnemo.splash2ndjune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.core.view.WindowCompat

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.Theme_Splash2ndJune_NoAb)

        setContentView(R.layout.activity_splash_screen)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        val logo: ImageView = findViewById(R.id.logo)

        logo.context

        logo.animate()
            .rotation(360f)
            .setDuration(2000L)
            .start()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            Intent(this, MainActivity::class.java).also {
                finish()
                startActivity(it)
            }
        }, 2000L)
    }
}