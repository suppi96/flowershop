package sheridan.sreekant.FlowerShop.data.repository

import sheridan.sreekant.FlowerShop.domain.Flower
interface FlowerDataRepository {

    suspend fun getAllFlowers(): List<Flower>
}