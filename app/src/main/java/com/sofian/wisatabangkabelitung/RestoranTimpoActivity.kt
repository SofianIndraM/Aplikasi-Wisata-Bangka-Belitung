package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restoran_otak.*
import kotlinx.android.synthetic.main.activity_restoran_timpo.*

class RestoranTimpoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restoran_timpo)

        btn_back11.setOnClickListener {
            var intent = Intent(this@RestoranTimpoActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_restoran_timpo2.setOnClickListener {
            var intent = Intent(this@RestoranTimpoActivity, RestoranTimpoMaps::class.java)
            startActivity(intent)
        }
        btn_direction_timpo.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.7348825802874988, 107.63108894853487&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call8.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+627199223242")
            startActivity(intent)
        }
    }
}
