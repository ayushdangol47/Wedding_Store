package com.safall.adoptdont_shop.api

import com.safall.adoptdont_shop.response.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SingleProductAPI {
    //Single product show
    @GET("/product/singleshow/{id}")
    suspend fun showSingleProduct(
            @Path("id")id:String
    ): Response<ProductResponse>
}