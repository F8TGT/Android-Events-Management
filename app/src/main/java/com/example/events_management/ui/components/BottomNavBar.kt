package com.example.events_management.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.events_management.R

data class Screen(
    val title: String,
    val icon: Painter
)

// TODO: Add Dynamically the Response of the API and configure the ROUTE

@Composable
fun BottomNavBar() {
    val items = listOf(
        Screen("Home", painterResource(id = R.drawable.rounded_home_24)),
        Screen("Events", painterResource(id = R.drawable.rounded_event_list_24)),
        Screen("Attendees", painterResource(id = R.drawable.rounded_connect_without_contact_24)),
        Screen("Profile", painterResource(id = R.drawable.rounded_person_edit_24)),
    )

    var selectedRoute by remember { mutableStateOf("Home") }

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primary,
        modifier = Modifier
    ) {
        items.forEach { screen ->
            NavigationBarItem(
                label = {
                    Text(
                        text = screen.title,
                        style = MaterialTheme.typography.labelSmall
                    )
                },
                icon = {
                    Icon(
                        painter = screen.icon,
                        contentDescription = null
                    ) },
                selected = selectedRoute == screen.title,
                onClick = { selectedRoute = screen.title },
                colors = NavigationBarItemDefaults.colors(
                    unselectedTextColor = Color.White,
                    selectedTextColor = Color.White,
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = Color.White,
                    indicatorColor = Color.White
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}