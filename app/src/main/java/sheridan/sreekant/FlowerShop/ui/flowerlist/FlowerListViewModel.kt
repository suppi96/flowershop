package sheridan.sreekant.FlowerShop.ui.flowerlist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sheridan.sreekant.FlowerShop.data.local.flowerList
import sheridan.sreekant.FlowerShop.ui.flowerlist.FlowerListUiState

class FlowerListViewModel : ViewModel() {

    private val _uiState: MutableState<FlowerListUiState> =
        mutableStateOf(FlowerListUiState.Loaded(flowerList))
    val uiState: State<FlowerListUiState> = _uiState

}