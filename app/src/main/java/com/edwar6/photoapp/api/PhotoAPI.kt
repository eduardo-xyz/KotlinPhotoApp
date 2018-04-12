package com.edwar6.photoapp.api

import com.edwar6.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=8668791-469897b83e1c40d0185ce13e2&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}