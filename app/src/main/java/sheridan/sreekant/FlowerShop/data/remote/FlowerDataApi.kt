package sheridan.sreekant.FlowerShop.data.remote

import retrofit2.http.GET

interface FlowerDataApi {
    @GET("flowers")
    suspend fun getRemoteData(): RemoteData
}