package com.sofian.wisatabangkabelitung

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restoran_dapoer.*
import kotlinx.android.synthetic.main.activity_restoran_neptune.*

class RestoranNeptuneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restoran_neptune)

        btn_back9.setOnClickListener {
            var intent = Intent(this@RestoranNeptuneActivity, MenuRestoran::class.java)
            startActivity(intent)
        }
        btn_restoran_neptune2.setOnClickListener {
            var intent = Intent(this@RestoranNeptuneActivity, RestoranNeptuneMaps::class.java)
            startActivity(intent)
        }
        btn_direction_neptune.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=-2.118160762148975, 106.17378337741593&mode=d"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btn_call6.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+627174256140")
            startActivity(intent)
        }

    }
}
