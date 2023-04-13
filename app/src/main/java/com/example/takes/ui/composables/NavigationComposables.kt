package com.example.takes.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.takes.R

@Composable
fun BottomNavBar() {
    BottomAppBar(actions = {
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(end = 50.dp)) {
            Icon(painter = painterResource(id = com.google.android.material.R.drawable.abc_ic_star_black_16dp), contentDescription = "")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = com.google.android.material.R.drawable.ic_clock_black_24dp), contentDescription = "")
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 50.dp)) {
            Icon(painter = painterResource(id = com.google.android.material.R.drawable.ic_keyboard_black_24dp), contentDescription = "")
        }
    },
        modifier = Modifier.wrapContentHeight(align = Alignment.Bottom),
        contentPadding = PaddingValues(start = 80.dp)
    )
}