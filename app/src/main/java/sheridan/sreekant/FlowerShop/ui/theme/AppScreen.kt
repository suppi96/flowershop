package sheridan.sreekant.FlowerShop.ui.theme

import androidx.compose.runtime.Composable

@Composable
fun AppScreen(){
    val viewModel: FlowerListViewModel = viewModel()

    FlowerListScreen(viewModel)
}