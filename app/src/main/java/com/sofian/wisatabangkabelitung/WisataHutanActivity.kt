package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_wisata.*
import kotlinx.android.synthetic.main.activity_wisata_hutan.*

class WisataHutanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_hutan)

        btn_wisata_hutan2.setOnClickListener {
            var intent = Intent(this@WisataHutanActivity, WisataHutanMaps::class.java)
            startActivity(intent)
        }
        btn_back16.setOnClickListener {
            var intent = Intent(this@WisataHutanActivity, MenuWisata::class.java)
            startActivity(intent)
        }
        btn_direction_hutan.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.114773529666991, 106.16026521250456&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}
