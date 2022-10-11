package com.example.cryptocurrency

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitGetInterface {
    @GET("8cf167fd-88e1-425a-8faf-f51fa8c6d1bf")
    fun getCryptocurrency(): Observable<List<ResponseItem>>

    companion object Factory {
        fun create(): RetrofitGetInterface {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.coinmarketcap.com/")
                .build()

            return retrofit.create(RetrofitGetInterface::class.java)
        }
    }
}