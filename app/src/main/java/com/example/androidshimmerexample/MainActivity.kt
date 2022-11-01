package com.example.androidshimmerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.HandlerCompat
import com.facebook.shimmer.ShimmerFrameLayout
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shimmerFrameLayout = this.findViewById<ShimmerFrameLayout>(R.id.shimmer_view_container)
        val viewContainer = this.findViewById<ConstraintLayout>(R.id.viewContainer)

        Handler().postDelayed({
            shimmerFrameLayout.stopShimmer()
            shimmerFrameLayout.visibility = View.GONE

            viewContainer.visibility = View.VISIBLE
        }, 2000)
    }
}