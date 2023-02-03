package com.sofian.wisatabangkabelitung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*
import java.text.SimpleDateFormat
import java.util.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_hotel.setOnClickListener{
            var intent = Intent(this@HomeActivity, MenuHotel::class.java)
            startActivity(intent)
        }
        btn_restoran.setOnClickListener{
            var intent = Intent(this@HomeActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_wisata.setOnClickListener{
            var intent = Intent(this@HomeActivity, MenuWisata::class.java)
            startActivity(intent)
        }
        btn_peta.setOnClickListener{
            var intent = Intent(this@HomeActivity, MenuPeta::class.java)
            startActivity(intent)
        }
        btn_tentang.setOnClickListener{
            var intent = Intent(this@HomeActivity, MenuTentangActivity::class.java)
            startActivity(intent)
        }
        val textView: TextView = findViewById(R.id.date)
        val simpleDateFormat = SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currentDateAndTime
        }
    }

