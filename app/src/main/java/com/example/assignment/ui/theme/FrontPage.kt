package com.example.assignment.ui.theme

import android.graphics.fonts.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.alpha
import com.example.assignment.R

@Composable
@Preview
fun FrontPage(){

    Column(
        Modifier
            .background(Purple700)
            .padding(15.dp)
            .fillMaxSize()
    ) {

        Text(text = "SUSSMAN", fontSize = 20.sp, color = Color.White)
        Spacer(modifier = Modifier.requiredHeight(170.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.pngwing_com),
                contentDescription = "drumStick",
                modifier = Modifier
                    .requiredSize(300.dp)
            
            )


            Text(
                modifier = Modifier
                    .rotate(-90f)

                    ,
                text = "Bag",

                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp


            )


        }

        Text(text = "THE SUREST PLUG TO LOOK SMART",
        color = Color.White,
        fontFamily = FontFamily.Monospace,
        fontSize = 26.sp)
        Spacer(modifier = Modifier.requiredHeight(20.dp))

        Text(text = "Feel the taste of looking good and smart for work.",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 18.sp)
        Spacer(modifier = Modifier.requiredHeight(10.dp))
        
        Column(Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(text = "Get Started")

            }
        }

        Spacer(modifier = Modifier.requiredHeight(20.dp))
    }





}