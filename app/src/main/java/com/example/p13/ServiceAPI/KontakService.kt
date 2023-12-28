package com.example.p13.ServiceAPI

interface KontakService {
    @Headers(
        "Accepy : application/json"
    )
    @GET("siswa.json")
    suspend fun getKontak(): List<Kontak>

}

