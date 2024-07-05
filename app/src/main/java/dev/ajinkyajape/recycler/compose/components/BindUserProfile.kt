package dev.ajinkyajape.recycler.compose.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import dev.ajinkyajape.recycler.compose.data.UserProfileData

@Composable
fun BindUserProfile() {
    val userProfileList = remember { UserProfileData.userProfileList }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = userProfileList,
            itemContent = {
                UserProfileCard(userProfile = it)
            }
        )
    }

}