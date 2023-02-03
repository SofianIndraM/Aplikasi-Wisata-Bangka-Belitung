package com.sofian.wisatabangkabelitung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_restoran.*

class MenuRestoran : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_restoran)

        btn_restoran_dapoer.setOnClickListener {
            var intent = Intent(this@MenuRestoran, RestoranDapoerActivity::class.java)
            startActivity(intent)
        }
        btn_restoran_neptune.setOnClickListener {
            var intent = Intent(this@MenuRestoran, RestoranNeptuneActivity::class.java)
            startActivity(intent)
        }
        btn_restoran_otak.setOnClickListener {
            var intent = Intent(this@MenuRestoran, RestoranOtakActivity::class.java)
            startActivity(intent)
        }
        btn_restoran_timpo.setOnClickListener {
            var intent = Intent(this@MenuRestoran, RestoranTimpoActivity::class.java)
            startActivity(intent)
        }
        btn_restoran_wan.setOnClickListener {
            var intent = Intent(this@MenuRestoran, RestoranWanActivity::class.java)
            startActivity(intent)
        }
        btn_back2.setOnClickListener {
            var intent = Intent(this@MenuRestoran, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
