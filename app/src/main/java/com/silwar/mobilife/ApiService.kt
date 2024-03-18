package com.silwar.mobilife

import com.silwar.mobilife.model.JobListResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/api")
    suspend fun getJobList(): Response<JobListResponse>
}