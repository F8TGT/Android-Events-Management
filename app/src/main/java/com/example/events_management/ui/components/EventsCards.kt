package com.example.events_management.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.events_management.R

@Composable
fun EventsCards() {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Events Name",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce sed.",
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = stringResource(id = R.string.start_time_lbl),
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Sep 12, 03:00 PM",
                            color = Color.DarkGray,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.headlineSmall,
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = stringResource(id = R.string.end_time_lbl),
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Sep 12, 04:00 PM",
                            color = Color.DarkGray,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.see_details_btn_lbl),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventsCardsPreview() {
    EventsCards()
}