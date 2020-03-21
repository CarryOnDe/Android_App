package com.marvin.carryonde.model

import com.google.gson.annotations.SerializedName

class Location {

    @SerializedName("country")
    var country : String = ""

    @SerializedName("zip")
    var zip : String = ""

    @SerializedName("street")
    var street : String = ""

    @SerializedName("number")
    var number : Int = 0

    @SerializedName("add")
    var add : String = ""


}