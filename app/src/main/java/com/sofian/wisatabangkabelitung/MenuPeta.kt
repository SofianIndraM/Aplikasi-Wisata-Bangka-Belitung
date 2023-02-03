package com.sofian.wisatabangkabelitung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.sofian.wisatabangkabelitung.databinding.ActivityMenuPetaBinding

class MenuPeta : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMenuPetaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuPetaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val peta = LatLng(-2.716413377849967, 106.43149577587606)
        mMap.addMarker(MarkerOptions().position(peta).title("Provinsi Bangka Belitung"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(peta,8f))

        val hotel_bangka = LatLng(-2.138483315382158, 106.14631115276174)
        mMap.addMarker(MarkerOptions().position(hotel_bangka).title("Lokasi Hotel Bangka")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_map_hotel)))
        

        val hotel_bw = LatLng(-2.728100172653269, 107.62907449419603)
        mMap.addMarker(MarkerOptions().position(hotel_bw).title("Lokasi Hotel BW").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_hotel)))
        

        val hotel_novilla = LatLng(-1.8458808826320912, 106.11209078819758)
        mMap.addMarker(MarkerOptions().position(hotel_novilla).title("Lokasi Hotel Novilla").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_hotel)))

        val hotel_Santika = LatLng(-2.557421334934936, 107.74516690000762)
        mMap.addMarker(MarkerOptions().position(hotel_Santika).title("Lokasi Hotel Santika").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_hotel)))

        val hotel_swiss = LatLng(-2.590768665059263, 107.64413450000785)
        mMap.addMarker(MarkerOptions().position(hotel_swiss).title("Lokasi Hotel Swiss").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_hotel)))

        val restoran_dapoer = LatLng(-2.740794490295427, 107.6364289504426)
        mMap.addMarker(MarkerOptions().position(restoran_dapoer).title("Lokasi Restoran Dapoer").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_restoran)))

        val restoran_neptune = LatLng(-2.118160762148975, 106.17378337741593)
        mMap.addMarker(MarkerOptions().position(restoran_neptune).title("Lokasi Restoran Neptune").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_restoran)))

        val restoran_otak = LatLng(-2.1336011229685288, 106.11447581075193)
        mMap.addMarker(MarkerOptions().position(restoran_otak).title("Lokasi Restoran Otak-otak").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_restoran)))

        val restoran_timpo = LatLng(-2.7348825802874988, 107.63108894853487)
        mMap.addMarker(MarkerOptions().position(restoran_timpo).title("Lokasi Restoran Belitong").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_restoran)))

        val restoran_wan = LatLng(-2.7389342169611046, 107.63607572559998)
        mMap.addMarker(MarkerOptions().position(restoran_wan).title("Lokasi Restoran WAN BIE").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_restoran)))

        val wisata_benteng = LatLng(-2.2418351484392036, 105.81869273270142)
        mMap.addMarker(MarkerOptions().position(wisata_benteng).title("Lokasi Wisata Benteng").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_wisata)))

        val wisata_danau = LatLng(-2.5478633780473543, 106.35285919991229)
        mMap.addMarker(MarkerOptions().position(wisata_danau).title("Lokasi Wisata Danau Kaolin").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_wisata)))

        val wisata_hutan = LatLng(-2.114773529666991, 106.16026521250456)
        mMap.addMarker(MarkerOptions().position(wisata_hutan).title("Lokasi Wisata Bangka Botanical Garden").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_wisata)))

        val wisata_museum = LatLng(-2.0622808595656275, 105.16606314401002)
        mMap.addMarker(MarkerOptions().position(wisata_museum).title("Lokasi Wisata Museum Timah").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_wisata)))

        val wisata_pantai = LatLng(-1.886577658031165, 106.17568374945155)
        mMap.addMarker(MarkerOptions().position(wisata_pantai).title("Lokasi Wisata Pantai Tikus").icon(
            BitmapDescriptorFactory.fromResource(R.drawable.icon_map_wisata)))
    }
}