package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restoran_neptune.*
import kotlinx.android.synthetic.main.activity_restoran_otak.*

class RestoranOtakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restoran_otak)

        btn_back10.setOnClickListener {
            var intent = Intent(this@RestoranOtakActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_restoran_otak2.setOnClickListener {
            var intent = Intent(this@RestoranOtakActivity, RestoranOtakMaps::class.java)
            startActivity(intent)
        }
        btn_direction_otak.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.1336011229685288, 106.11447581075193&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call7.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+62717424652")
            startActivity(intent)
        }

    }
}
