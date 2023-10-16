package sheridan.sreekant.FlowerShop.data.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun flowerDataRepository(repository: FakeFlowerDataRepository): FlowerDataRepository

}