package com.example.events_management.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.events_management.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavBar() {
    var menuExpanded by remember { mutableStateOf(false) }
    TopAppBar(
        title = {},
        actions = {
            IconButton(onClick = { menuExpanded = true }) {
                Icon(
                    painter = painterResource(id = R.drawable.rounded_more_vert_24),
                    contentDescription = "Menu",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        },
        modifier = Modifier.fillMaxWidth()
    )

    DropdownMenu(
        expanded = menuExpanded,
        onDismissRequest = { menuExpanded = false }
    ) {
        DropdownMenuItem(
            text = {
                Text(
                    text = stringResource(id = R.string.sign_out_lbl),
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.labelMedium
                )
            },
            onClick = { /* TODO Handle Settings action  */ },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.rounded_logout_24),
                    contentDescription = null
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopNavBarPreview() {
    TopNavBar()
}