package com.example.p13.ServiceAPI

interface AppContainer {
    val kontakService: KontakRepository
}
class KontakContainer : AppContainer{
    private val baseUrl = "https:kancadonor.net//donoro"
    private val json = Json{ignotrUnknownKeys = true}
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConvertFactory(jsonasConverterFctory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    private val kontakService: KontakService by lazy {
        retrofit.create(KontakService::class.java)
    }
    override val kontakRepository: KontakRepository by lazy {
        NetworkKontakRepository(kontakService)
    }
}