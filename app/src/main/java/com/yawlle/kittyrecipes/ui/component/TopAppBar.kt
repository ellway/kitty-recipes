package com.yawlle.kittyrecipes.ui.component

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.yawlle.kittyrecipes.R
import com.yawlle.kittyrecipes.ui.theme.PrimaryColor


@Composable
fun TopAppBar(title: String? = "", onBackClick: () -> Unit) {

    val context = LocalContext.current

    val iconBack = painterResource(id = R.drawable.baseline_arrow_back)
    val iconSearch = painterResource(id = R.drawable.ic_search)

    CenterAlignedTopAppBar(
        title = {
            Text(
                "$title",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        navigationIcon = {
            IconButton(onClick = { onBackClick() }) {
                Icon(
                    iconBack,
                    contentDescription = "Voltar",
                )
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    iconSearch,
                    contentDescription = "Search",
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = PrimaryColor
        )
    )
}

