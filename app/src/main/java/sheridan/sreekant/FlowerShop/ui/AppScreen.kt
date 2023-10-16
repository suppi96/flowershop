package sheridan.sreekant.FlowerShop.ui

import sheridan.sreekant.FlowerShop.ui.flowerlist.FlowerListViewModel
import sheridan.sreekant.FlowerShop.ui.flowerlist.FlowerListScreen

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun AppScreen(){
    val viewModel: FlowerListViewModel = viewModel()

    FlowerListScreen(viewModel)
}