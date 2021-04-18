package com.safall.adoptdont_shop.api

import com.safall.adoptdont_shop.response.ImageResponse
import com.safall.adoptdont_shop.response.ProductResponse

import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface ProductAPI {
    @GET("product/show/")
    suspend fun getAllProducts(
//            @Header("Authorization") token:String,
    ) : Response<ProductResponse>

//    @Multipart
//    @PUT("product/{id}/photo")
//    suspend fun uploadImage(
//            @Header("Authorization") token: String,
//            @Path("id") id: String,
//            @Part file: MultipartBody.Part
//    ): Response<ImageResponse>
}