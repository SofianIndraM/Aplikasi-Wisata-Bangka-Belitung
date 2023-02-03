package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_bangka.*
import kotlinx.android.synthetic.main.activity_hotel_bw.*

class HotelBwActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_bw)

        btn_back4.setOnClickListener {
            var intent = Intent(this@HotelBwActivity, MenuHotel::class.java)
            startActivity(intent)
        }
        btn_map_hotel_bw2.setOnClickListener {
            var intent = Intent(this@HotelBwActivity, HotelBwMaps::class.java)
            startActivity(intent)
        }
        btn_direction_hotel_bw.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.728100172653269, 107.62907449419603&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call1.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+6271923898")
            startActivity(intent)
        }
    }
}
