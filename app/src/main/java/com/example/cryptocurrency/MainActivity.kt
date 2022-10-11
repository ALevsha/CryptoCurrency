package com.example.cryptocurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = RetrofitGetInterface.create()
        apiService.getCryptocurrency()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                result -> arrayListInit(result)
            },{
                error -> error.printStackTrace()
            })
    }

    private fun arrayListInit(result: List<ResponseItem>?) {
        TODO("Not yet implemented")
    }
}