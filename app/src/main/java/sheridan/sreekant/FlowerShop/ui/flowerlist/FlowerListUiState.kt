package sheridan.sreekant.FlowerShop.ui.flowerlist

import sheridan.sreekant.FlowerShop.domain.Flower

sealed interface FlowerListUiState {
    data class Loaded(val flowers: List<Flower>):FlowerListUiState
    object Loading: FlowerListUiState
    object Error: FlowerListUiState
}