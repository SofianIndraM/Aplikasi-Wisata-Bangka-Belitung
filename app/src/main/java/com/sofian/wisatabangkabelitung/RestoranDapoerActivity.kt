package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_swiss.*
import kotlinx.android.synthetic.main.activity_restoran_dapoer.*

class RestoranDapoerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restoran_dapoer)

        btn_back8.setOnClickListener {
            var intent = Intent(this@RestoranDapoerActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_restoran_dapoer2.setOnClickListener {
            var intent = Intent(this@RestoranDapoerActivity, RestoranDapoerMaps::class.java)
            startActivity(intent)
        }
        btn_direction_dapoer.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.740794490295427, 107.6364289504426&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call5.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+6271923297")
            startActivity(intent)
        }
    }
}
