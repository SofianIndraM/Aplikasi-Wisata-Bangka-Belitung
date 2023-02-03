package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_bangka.*

class HotelBangkaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_bangka)

        btn_back.setOnClickListener {
            var intent = Intent(this@HotelBangkaActivity, MenuHotel::class.java)
            startActivity(intent)
        }
        btn_map_hotel_bangka2.setOnClickListener {
            var intent = Intent(this@HotelBangkaActivity, HotelBangkaMaps::class.java)
            startActivity(intent)
        }
        btn_direction_hotel_bangka.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
            Uri.parse("google.navigation:q=-2.138483315382158, 106.14631115276174&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
                startActivity(intent)
        }
        btn_call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+627174262907")
            startActivity(intent)
        }
    }
}
