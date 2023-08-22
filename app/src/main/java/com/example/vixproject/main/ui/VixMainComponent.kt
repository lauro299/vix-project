package com.example.vixproject.main.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.vixproject.R
import com.example.vixproject.main.domain.model.VideoData
import com.example.vixproject.main.ui.node.HeroNodeComponent
import com.example.vixproject.main.ui.node.NodeComponent
import org.koin.androidx.compose.koinViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainComponent(
    mainViewModel: MainViewModel = koinViewModel(),//viewModel(factory = MainViewModel.Factory),
    goToDetail: (VideoData) -> Unit
) {
    val nodes = mainViewModel.nodesFlow//.collectAsStateWithLifecycle()//mainViewModel.nodes
    if(nodes.isEmpty()){
        Box(Modifier.fillMaxSize()) {
            CircularProgressIndicator(
                modifier=Modifier.align(Alignment.Center)
            )
        }
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vix_logo_unicolor),
                        contentDescription = null,
                        modifier = Modifier.width(54.dp)
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            8.dp
                        ),
                    ) {
                        OutlinedButton(
                            onClick = { /*TODO*/ },
                            border = BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                            contentPadding = PaddingValues(0.dp),
                        ) {
                            Text(
                                stringResource(id = R.string.btn_test_premium),
                                color = MaterialTheme.colorScheme.onBackground,
                                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier.size(48.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Search, contentDescription = stringResource(
                                    id = R.string.label_search
                                ), tint = MaterialTheme.colorScheme.onBackground
                            )
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier.size(48.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = stringResource(
                                    id = R.string.label_search
                                ),
                                tint = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    }
                }
            }
            item {
                //list of badgeds
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(mainViewModel.getBadges) {
                        FilterChip(
                            selected = it == LABEL_INIT,
                            onClick = { /*TODO*/ },
                            label = { Text(text = it) },
                            shape = CircleShape
                        )
                    }
                }
            }
            items(nodes) {
                if (it.isHero())
                    HeroNodeComponent(node = it) {
                        goToDetail(it)
                    }
                else
                    NodeComponent(node = it) {
                        goToDetail(it)
                    }
            }
        }
    }
}


