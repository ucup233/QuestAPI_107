package com.example.week12.apiservice

import com.example.week12.modeldata.DataSiswa
import retrofit2.http.GET


interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

}