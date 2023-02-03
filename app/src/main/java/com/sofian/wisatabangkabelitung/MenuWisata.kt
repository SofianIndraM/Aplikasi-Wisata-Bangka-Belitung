package com.sofian.wisatabangkabelitung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_wisata.*

class MenuWisata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_wisata)

        btn_back3.setOnClickListener {
            var intent = Intent(this@MenuWisata, HomeActivity::class.java)
            startActivity(intent)
        }
        btn_wisata_danau.setOnClickListener {
            var intent = Intent(this@MenuWisata, WisataDanauActivity::class.java)
            startActivity(intent)
        }
        btn_wisata_hutan.setOnClickListener {
            var intent = Intent(this@MenuWisata, WisataHutanActivity::class.java)
            startActivity(intent)
        }
        btn_wisata_museum.setOnClickListener {
            var intent = Intent(this@MenuWisata, WisataMuseumActivity::class.java)
            startActivity(intent)
        }
        btn_wisata_pantai.setOnClickListener {
            var intent = Intent(this@MenuWisata, WisataPantaiActivity::class.java)
            startActivity(intent)
        }
        btn_wisata_benteng.setOnClickListener {
            var intent = Intent(this@MenuWisata, WisataBentengActivity::class.java)
            startActivity(intent)
        }
    }
}
