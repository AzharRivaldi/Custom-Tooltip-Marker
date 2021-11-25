package com.azhar.tooltipmarker.model.response

import com.google.gson.annotations.SerializedName
import com.azhar.tooltipmarker.model.nearby.ModelResults

/**
 * Created by Azhar Rivaldi on 06-06-2021
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * Linkedin : https://www.linkedin.com/in/azhar-rivaldi
 */

class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}