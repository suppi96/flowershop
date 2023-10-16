package sheridan.sreekant.FlowerShop.ui.flowerlist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject
import sheridan.sreekant.FlowerShop.data.repository.FlowerDataRepository

@HiltViewModel
class FlowerListViewModel @Inject constructor(
    private val repository: FlowerDataRepository
) : ViewModel() {

    private val _uiState: MutableState<FlowerListUiState> =
        mutableStateOf(FlowerListUiState.Loading)
    val uiState: State<FlowerListUiState> = _uiState

    init {
        loadFlowerList()
    }

    private fun loadFlowerList() = viewModelScope.launch{
        delay(2000)
        try{
            val flowers = repository.getAllFlowers()
            _uiState.value = FlowerListUiState.Loaded(flowers)
        } catch(e: Exception) {
            _uiState.value = FlowerListUiState.Error
            e.printStackTrace()
        }
    }

    fun reloadFlowerList(){
        _uiState.value = FlowerListUiState.Loading
        loadFlowerList()
    }


}