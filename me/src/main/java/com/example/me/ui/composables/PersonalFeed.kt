package com.example.me.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.takes.data.models.Take

@Composable
fun PersonalFeedView(takes: List<Take>) {
    Box(modifier = Modifier.fillMaxSize(fraction = .80F)) {
        LazyColumn(content = {
            items(count = takes.size) {
                TakeFeedItem(takes[it])
            }
        })
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TakeFeedItem(take: Take) {
    Card(onClick = { /*TODO*/ }) {
        Text(text = take.message)
    }
}
