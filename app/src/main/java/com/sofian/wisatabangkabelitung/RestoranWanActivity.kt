package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restoran_timpo.*
import kotlinx.android.synthetic.main.activity_restoran_wan.*

class RestoranWanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restoran_wan)

        btn_back12.setOnClickListener {
            var intent = Intent(this@RestoranWanActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_restoran_wan2.setOnClickListener {
            var intent = Intent(this@RestoranWanActivity, RestoranWanMaps::class.java)
            startActivity(intent)
        }
        btn_direction_wan.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.7389342169611046, 107.63607572559998&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call9.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+6281311411417")
            startActivity(intent)
        }

    }
}
