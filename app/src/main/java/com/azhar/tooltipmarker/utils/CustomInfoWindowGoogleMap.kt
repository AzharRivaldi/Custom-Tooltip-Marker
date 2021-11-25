package com.azhar.tooltipmarker.utils

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.azhar.tooltipmarker.R
import com.azhar.tooltipmarker.model.nearby.ModelResults
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.model.Marker

/**
 * Created by Azhar Rivaldi on 16-11-2021
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

class CustomInfoWindowGoogleMap(private val context: Context) : InfoWindowAdapter {

    override fun getInfoWindow(marker: Marker): View? {
        val view = (context as AppCompatActivity)
            .layoutInflater
            .inflate(R.layout.layout_tooltip_marker, null)

        val tvNamaLokasi = view.findViewById<TextView>(R.id.tvNamaLokasi)
        val tvAlamat = view.findViewById<TextView>(R.id.tvAlamat)
        val infoWindowData = marker.tag as ModelResults

        tvNamaLokasi.text = infoWindowData.name
        tvAlamat.text = infoWindowData.vicinity

        return view
    }

    override fun getInfoContents(marker: Marker): View? {
        return null
    }
}