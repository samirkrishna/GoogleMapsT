package com.has.sam.cej.googlemapst

import android.graphics.BitmapFactory
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sMap=supportFragmentManager.findFragmentById(R.id.frag1)as SupportMapFragment
        sMap.getMapAsync(object : OnMapReadyCallback {
            override fun onMapReady(gMap: GoogleMap?) {

                Toast.makeText(this@MainActivity,"Map is ready..",Toast.LENGTH_LONG).show()

                var marker=MarkerOptions()
                marker.position(LatLng(17.4373252,17.4494391))
                marker.title("NIT")
                marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.m))//to add customised marker use this code
                gMap?.addMarker(marker)
                gMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(17.4373252,17.4494391),14f))//distance from camera and maps for zoom purpose
            }
        })
    }
}
