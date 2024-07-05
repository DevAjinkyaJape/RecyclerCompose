package dev.ajinkyajape.recycler.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.ajinkyajape.recycler.compose.model.UserProfile


@Composable
fun UserProfileCard (userProfile: UserProfile){

    Card(modifier = Modifier
        .padding(horizontal = 8.dp, vertical = 7.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ){
        Row(modifier = Modifier
            .padding(20.dp)) {

            Column(modifier = Modifier.weight(1f),
                Arrangement.Center) {

                Text(text = "Name: ${userProfile.sUserName}", modifier = Modifier.padding(2.dp))

                Text(text = "Designation: ${userProfile.sDesignation}", modifier = Modifier.padding(2.dp))

                Text(text = "Experience: ${userProfile.sYearsOfExperience}", modifier = Modifier.padding(2.dp))

                Text(text = "Skills: ${userProfile.sTechSkills}", modifier = Modifier.padding(2.dp))

                Text(text = "Location: ${userProfile.sLocation}", modifier = Modifier.padding(2.dp))
            }
        }
    }
}