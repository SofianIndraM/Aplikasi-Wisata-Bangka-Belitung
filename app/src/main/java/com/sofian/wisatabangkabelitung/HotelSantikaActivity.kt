package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_novilla.*
import kotlinx.android.synthetic.main.activity_hotel_santika.*

class HotelSantikaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_santika)

        btn_back6.setOnClickListener {
            var intent = Intent(this@HotelSantikaActivity, MenuHotel::class.java)
            startActivity(intent)
        }
        btn_map_hotel_santika2.setOnClickListener {
            var intent = Intent(this@HotelSantikaActivity, HotelSantikaMaps::class.java)
            startActivity(intent)
        }
        btn_direction_hotel_santika.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.557421334934936, 107.74516690000762&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call3.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+6282371891889")
            startActivity(intent)
        }
    }
}
