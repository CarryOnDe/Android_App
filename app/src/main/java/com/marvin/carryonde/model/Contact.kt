package com.marvin.carryonde.model

import com.google.gson.annotations.SerializedName

class Contact {

    @SerializedName("name")
    var name: String = ""

    @SerializedName("tel")
    var tel: String = ""

    @SerializedName("mail")
    var mail : String = ""

}