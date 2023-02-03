package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restoran_wan.*
import kotlinx.android.synthetic.main.activity_wisata_benteng.*

class WisataBentengActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_benteng)

        btn_back14.setOnClickListener {
            var intent = Intent(this@WisataBentengActivity, MenuWisata::class.java)
            startActivity(intent)
        }
        btn_wisata_benteng2.setOnClickListener {
            var intent = Intent(this@WisataBentengActivity, WisataBentengMaps::class.java)
            startActivity(intent)
        }
        btn_direction_benteng.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.2418351484392036, 105.81869273270142&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}
