package com.example.events_management.ui.event

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.events_management.R
import com.example.events_management.ui.components.BottomNavBar
import com.example.events_management.ui.components.EventsCards
import com.example.events_management.ui.components.TopNavBar
import com.example.events_management.ui.theme.EventsManagementTheme

@Composable
fun Event(modifier: Modifier = Modifier) {
    EventsManagementTheme {
        Surface(
            color = MaterialTheme.colorScheme.surfaceContainer,
            modifier = modifier
        ) {
            Scaffold(
                topBar = { TopNavBar() },
                bottomBar = { BottomNavBar() }
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxSize()
                    ) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = stringResource(id = R.string.welcome_lbl),
                                color = MaterialTheme.colorScheme.primary,
                                style = MaterialTheme.typography.headlineLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = stringResource(id = R.string.home_top_description_txt),
                                color = Color.DarkGray,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
//                            TODO Events Card Retrieve from API Service
                            EventsCards()
                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
//                            TODO Events Card Retrieve from API Service
                            EventsCards()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventPreview() {
    Event()
}