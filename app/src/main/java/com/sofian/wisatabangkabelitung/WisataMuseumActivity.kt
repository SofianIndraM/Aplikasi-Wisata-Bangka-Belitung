package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wisata_museum.*

class WisataMuseumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_museum)

        btn_wisata_museum2.setOnClickListener {
            var intent = Intent(this@WisataMuseumActivity, WisataMuseumMaps::class.java)
            startActivity(intent)
        }
        btn_back17.setOnClickListener {
            var intent = Intent(this@WisataMuseumActivity, MenuWisata::class.java)
            startActivity(intent)
        }
        btn_direction_museum.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.0622808595656275, 105.16606314401002&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}
