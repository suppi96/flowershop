package sheridan.sreekant.FlowerShop.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

import sheridan.sreekant.FlowerShop.data.remote.FlowerDataApi
import sheridan.sreekant.FlowerShop.data.remote.RemoteData
import sheridan.sreekant.FlowerShop.data.remote.RemoteFlower
import sheridan.sreekant.FlowerShop.domain.Flower

class FlowerDataRepositoryImpl @Inject constructor(
    private val flowerDataApi: FlowerDataApi
): FlowerDataRepository{
    override suspend fun getAllFlowers(): List<Flower> =
            withContext(Dispatchers.IO){
            val remoteData:RemoteData = flowerDataApi.getRemoteData()
            remoteData._embedded.flowers.map { it.toFlower() }

    }
}

fun RemoteFlower.toFlower() = Flower(
    id = this.id,
    name = this.name,
    price = this.price,
    description = this.description,
    image = this.image
)