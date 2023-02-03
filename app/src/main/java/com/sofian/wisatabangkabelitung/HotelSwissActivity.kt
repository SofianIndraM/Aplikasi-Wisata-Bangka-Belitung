package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_santika.*
import kotlinx.android.synthetic.main.activity_hotel_swiss.*

class HotelSwissActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_swiss)

        btn_back7.setOnClickListener {
            var intent = Intent(this@HotelSwissActivity, MenuHotel::class.java)
            startActivity(intent)
        }

        btn_hotel_swiss2.setOnClickListener {
            var intent = Intent(this@HotelSwissActivity, HotelSwissMaps::class.java)
            startActivity(intent)
        }
        btn_direction_hotel_swiss.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.590768665059263, 107.64413450000785&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call4.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+627199304888")
            startActivity(intent)
        }
    }
}
