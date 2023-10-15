package sheridan.sreekant.FlowerShop.ui.flowerlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sheridan.sreekant.FlowerShop.R
import sheridan.sreekant.FlowerShop.domain.Flower
import coil.compose.AsyncImage

@Composable
fun ListBody (
    flowerList: List<Flower>,
    modifier: Modifier
){
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp, horizontal = 16.dp
        ), modifier = modifier
        
        ){
        items(flowerList) { flower -> 
            FlowerListItem(flower)
        }
    }
}

@Composable
fun FlowerListItem(flower: Flower) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ){
            AsyncImage(model = "file:///android_asset/images/${flower.image}",
                contentDescription = "${flower.description} ${flower.name}"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = flower.description.capitalize(Locale.current),
                        fontSize = 28.sp
                    )
                    Text(
                        text = flower.name,
                        fontSize = 28.sp
                    )
                }
                Text(
                    text = flower.price,
                    fontSize = 24.sp
                )
            }
        }
    }
}