package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wisata_danau.*

class WisataDanauActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_danau)

        btn_back15.setOnClickListener {
            var intent = Intent(this@WisataDanauActivity, MenuWisata::class.java)
            startActivity(intent)
        }
        btn_wisata_danau2.setOnClickListener {
            var intent = Intent(this@WisataDanauActivity, WisataDanauMaps::class.java)
            startActivity(intent)
        }
        btn_direction_danau.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.5478633780473543, 106.35285919991229&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}
