package sheridan.sreekant.FlowerShop.data.repository

import sheridan.sreekant.FlowerShop.data.local.flowerList
import sheridan.sreekant.FlowerShop.domain.Flower

import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext



class FakeFlowerDataRepository @Inject constructor(): FlowerDataRepository{

    override suspend fun getAllFlowers(): List<Flower> =
        withContext(Dispatchers.IO){
            flowerList
        }

}