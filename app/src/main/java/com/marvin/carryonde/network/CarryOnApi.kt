package com.marvin.carryonde.network

import com.marvin.carryonde.model.HelpRequest
import retrofit2.http.GET
import retrofit2.http.Path

interface CarryOnApi {
    @GET("organisation/helprequest/{zip}/{rad}")
    fun getHelpRequestsByRadius(@Path("zip") zip : String, @Path("rad") rad: String) : List<HelpRequest>
}