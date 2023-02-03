package com.sofian.wisatabangkabelitung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_hotel.*

class MenuHotel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_hotel)

        btn_back1.setOnClickListener{
            var intent = Intent(this@MenuHotel, HomeActivity::class.java)
            startActivity(intent)
        }
        btn_hotel_bangka.setOnClickListener{
            var intent = Intent(this@MenuHotel, HotelBangkaActivity::class.java)
            startActivity(intent)
        }
        btn_hotel_bw.setOnClickListener{
            var intent = Intent(this@MenuHotel, HotelBwActivity::class.java)
            startActivity(intent)
        }
        btn_hotel_novilla.setOnClickListener{
            var intent = Intent(this@MenuHotel, HotelNovillaActivity::class.java)
            startActivity(intent)
        }
        btn_hotel_santika.setOnClickListener{
            var intent = Intent(this@MenuHotel, HotelSantikaActivity::class.java)
            startActivity(intent)
        }
        btn_hotel_swiss.setOnClickListener{
            var intent = Intent(this@MenuHotel, HotelSwissActivity::class.java)
            startActivity(intent)
        }
    }
}
