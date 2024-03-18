package com.silwar.mobilife.model

import com.google.gson.annotations.SerializedName

data class JobListResponse(
    @SerializedName("last_updated")
    val lastUpdatedTimestamp: String?,
    @SerializedName("legal")
    val legal: String?
)

data class JobResponse(
    @SerializedName("job_title")
    val jobTitle: String?
)