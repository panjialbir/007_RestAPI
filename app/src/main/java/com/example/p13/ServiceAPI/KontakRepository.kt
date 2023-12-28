package com.example.p13.ServiceAPI

interface KontakRepository {

    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val KontakApiService: KontakService
) : KontakRepository{
    override suspend getKontak(): List<Kontak> = KontakApiService.getkontak()

}