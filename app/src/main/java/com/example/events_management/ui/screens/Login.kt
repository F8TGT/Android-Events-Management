package com.example.events_management.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.events_management.R
import com.example.events_management.ui.theme.EventsManagementTheme

@Composable
fun Login(modifier: Modifier = Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val usernameError by remember { mutableStateOf(false) }
    val passwordError by remember { mutableStateOf(false) }

    EventsManagementTheme {
        Surface(
            color = MaterialTheme.colorScheme.surfaceContainer,
            tonalElevation = 5.dp
        ) {
            Scaffold(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->
                Box(
                    contentAlignment = Alignment.TopCenter,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(innerPadding)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.login_top_banner),
                        contentDescription = null
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .verticalScroll(rememberScrollState()),
                        contentAlignment = Alignment.Center,
                    ) {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceContainer
                            ),
                            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(3f / 4f)
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(vertical = 50.dp, horizontal = 16.dp)
                                    .fillMaxSize()
                            ) {
                                Row(modifier = Modifier.fillMaxWidth()) {
                                    Text(
                                        text = stringResource(id = R.string.welcome_lbl),
                                        color = Color.DarkGray,
                                        style = MaterialTheme.typography.bodyLarge
                                    )
                                }
                                Row(modifier = Modifier.fillMaxWidth()) {
                                    Text(
                                        text = stringResource(id = R.string.sign_in_lbl),
                                        color = MaterialTheme.colorScheme.primary,
                                        style = MaterialTheme.typography.headlineLarge,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Spacer(modifier = Modifier.height(16.dp))
                                OutlinedTextField(
                                    value = username,
                                    onValueChange = { username = it },
                                    label = {
                                        Row {
                                            Text(
                                                text = "Email",
                                                color = Color.DarkGray,
                                                style = MaterialTheme.typography.labelLarge
                                            )
                                            Text(
                                                text = "*",
                                                color = MaterialTheme.colorScheme.error,
                                                style = MaterialTheme.typography.labelLarge
                                            )
                                        }
                                    },
                                    isError = usernameError,
                                    modifier = Modifier.fillMaxWidth(),
                                    singleLine = true,
                                    supportingText = {
                                        if (usernameError) {
                                            Text(
                                                text = "Username is required",
                                                color = MaterialTheme.colorScheme.error,
                                                style = MaterialTheme.typography.labelMedium
                                            )
                                        } else {
                                            Text(
                                                text = "*required",
                                                color = Color.DarkGray,
                                                style = MaterialTheme.typography.labelMedium
                                            )
                                        }
                                    }
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                OutlinedTextField(
                                    value = password,
                                    onValueChange = { password = it },
                                    label = {
                                        Row {
                                            Text(
                                                text = "Password",
                                                color = Color.DarkGray,
                                                style = MaterialTheme.typography.labelLarge
                                            )
                                            Text(
                                                text = "*",
                                                color = MaterialTheme.colorScheme.error,
                                                style = MaterialTheme.typography.labelLarge
                                            )
                                        }
                                    },
                                    isError = passwordError,
                                    modifier = Modifier.fillMaxWidth(),
                                    singleLine = true,
                                    visualTransformation = PasswordVisualTransformation(),
                                    supportingText = {
                                        if (passwordError) {
                                            Text(
                                                text = "Password is required",
                                                color = MaterialTheme.colorScheme.error,
                                                style = MaterialTheme.typography.labelMedium
                                            )
                                        } else {
                                            Text(
                                                text = "*required",
                                                color = Color.DarkGray,
                                                style = MaterialTheme.typography.labelMedium
                                            )
                                        }
                                    }
                                )
                                Spacer(modifier = Modifier.height(20.dp))
                                Button(
                                    onClick = { },
                                    elevation = ButtonDefaults.buttonElevation(
                                        defaultElevation = 5.dp
                                    ),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.sign_up_lbl),
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}