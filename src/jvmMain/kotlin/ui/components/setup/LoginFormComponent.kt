package ui.components.setup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginFormComponent {

    @Composable
    fun generateForm() {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .padding(27.dp)
        ) {
            Column(
                modifier = Modifier
                    .width(373.dp)
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 35.dp)
                ) {
                    Text("OpenTime", fontSize = 36.sp)
                    Text("Tracker", fontSize = 36.sp, color = Color("#A571F8".removePrefix("#").toLong(16) or 0x00000000FF000000))
                }

                Column(
                    modifier = Modifier
                        .padding(top = 25.dp)
                ) {
                    Image(
                        painter = getClockImage(),
                        contentDescription = "",
                        modifier = Modifier
                            .width(300.dp)
                            .height(311.dp)
                    )
                }
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(373.dp)
                    .fillMaxHeight()
            ) {
                Column{

                }
            }
        }
    }
    @Composable
    private fun getClockImage() = painterResource("images/clock.png")
}