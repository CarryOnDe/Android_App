package com.marvin.carryonde.model

import com.google.gson.annotations.SerializedName
import java.sql.Time
import java.util.*

class HelpRequest {


    @SerializedName("organisationId")
    var organisationId: String = ""

    @SerializedName("title")
    var title: String = ""

    @SerializedName("description")
    var description: String = ""

    @SerializedName("requestDate")
    var requestDate: Date = Date()

    @SerializedName("location")
    var location : Location? = null


    constructor(organisationId : String, title : String, description : String ){
        this.organisationId = organisationId
        this.title = title
        this.description = description
    }

}