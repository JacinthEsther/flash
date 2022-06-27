package com.example.assignment.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.assignment.R


@Composable
fun Header(
    headerText: String,
    modifier: Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(
                    id = R.drawable.ic_baseline_menu_24
                ),
                contentDescription = ""
            )
        }
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "",
                tint = locationColor
            )
            Text(text = headerText)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_tag_faces_24),
                contentDescription = "",
                tint = peachColor
            )
        }
    }
}