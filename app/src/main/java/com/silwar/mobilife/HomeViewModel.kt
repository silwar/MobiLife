package com.silwar.mobilife

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeViewModel : ViewModel() {

    val retrofit = Retrofit.Builder()
        .baseUrl(AppConstants.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(ApiService::class.java)

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val result = service.getJobList()
            result.let{
                Log.d("RESPONSE", "${it.body()?.lastUpdatedTimestamp}")
            }
        }
    }
}