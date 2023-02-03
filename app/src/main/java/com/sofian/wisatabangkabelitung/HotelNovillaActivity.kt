package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_novilla.*

class HotelNovillaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_novilla)

        btn_back5.setOnClickListener {
            var intent = Intent(this@HotelNovillaActivity, MenuHotel::class.java)
            startActivity(intent)
        }
        btn_map_hotel_novilla2.setOnClickListener {
            var intent = Intent(this@HotelNovillaActivity, HotelNovillaMaps::class.java)
            startActivity(intent)
        }
        btn_direction_hotel_novilla.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-1.8458808826320912, 106.11209078819758&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call2.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+6271792535")
            startActivity(intent)
        }
    }
}
