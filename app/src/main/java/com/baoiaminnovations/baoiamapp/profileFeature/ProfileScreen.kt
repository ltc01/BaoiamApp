package com.baoiaminnovations.baoiamapp.profileFeature

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column



import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.outlined.AddAPhoto
import androidx.compose.material.icons.outlined.ArrowOutward
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.baoiaminnovations.baoiamapp.R
import com.baoiaminnovations.baoiamapp.common.presentation.Screens
import com.baoiaminnovations.baoiamapp.ui.theme.LinearGradient
import com.baoiaminnovations.baoiamapp.ui.theme.LinearGradient2



@Composable
fun ProfileScreen(navHostController: NavHostController) {



    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {

        Row(modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()) {

            Image(painter = painterResource(
                id = R.drawable.ic_android_black_24dp), contentDescription = "",
                modifier = Modifier
                    .size(71.dp)
                    .padding(start = 10.dp)
                    .clip(CircleShape)
                    .border(
                        2.dp, color = Color.Yellow, CircleShape
                    ))
            Column() {
                Text(text = stringResource(id = R.string.name)
                    , fontWeight = FontWeight.Bold
                    , modifier = Modifier.padding(start = 20.dp, top = 15.dp)
                    , fontSize = 18.sp
                    , color = Color.Black)

                Text(text ="user email address"
                    , fontWeight = FontWeight.Normal
                    , modifier = Modifier.padding(start = 20.dp, top = 5.dp)
                    , fontSize = 15.sp
                    , color = Color.Black)
            }
                Row(modifier = Modifier
                    .padding(start = 110.dp)
                    .align(CenterVertically)) {
                    IconButton(onClick = { navHostController.navigate(Screens.EditProfile.route)}) {
                       Icon(imageVector = Icons.Outlined.AddAPhoto, contentDescription = "")
                    }

                }
        }
                Spacer(modifier = Modifier.height(50.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    ,verticalAlignment =CenterVertically) {
                    IconButton(onClick = { /*TODO*/ }
                        , modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .padding(start = 20.dp)) {
                        Icon(imageVector = Icons.Outlined.Bookmark
                            , contentDescription = ""
                        , modifier = Modifier.fillMaxSize()

                        )
                    }

                    Text(text = stringResource(
                        id = R.string.wishlist)
                        , fontSize = 18.sp
                        , fontWeight = FontWeight.Bold
                    , modifier = Modifier.padding(start = 30.dp)
                    )

                    Icon(imageVector = Icons.Outlined.Bookmark
                        , contentDescription = ""
                        , modifier = Modifier
                            .padding(start = 200.dp)
                            .size(20.dp)

                    )
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    ,verticalAlignment =CenterVertically) {
            IconButton(onClick = { /*TODO*/ }
                , modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(start = 20.dp)) {
                Icon(imageVector = Icons.Outlined.Bookmark
                    , contentDescription = ""
                    , modifier = Modifier
                        .fillMaxSize()
                )
            }

            Text(text = stringResource(
                id = R.string.certificate)
                , fontSize = 18.sp
                , fontWeight = FontWeight.Bold
                , modifier = Modifier.padding(start = 30.dp)
            )

            Icon(imageVector = Icons.Outlined.Bookmark
                , contentDescription = ""
                , modifier = Modifier
                    .padding(start = 180.dp)
                    .size(20.dp)

            )
        }

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    ,verticalAlignment =CenterVertically) {
            IconButton(onClick = { /*TODO*/ }
                , modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(start = 20.dp)) {
                Icon(imageVector = Icons.Outlined.Bookmark
                    , contentDescription = ""
                    , modifier = Modifier
                        .fillMaxSize()
                )
            }

            Text(text = stringResource(
                id = R.string.refer_and_earn)
                , fontSize = 18.sp
                , fontWeight = FontWeight.Bold
                , modifier = Modifier.padding(start = 30.dp)
            )

            Icon(imageVector = Icons.Outlined.Bookmark
                , contentDescription = ""
                , modifier = Modifier
                    .padding(start = 148.dp)
                    .size(20.dp)

            )
        }

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    ,verticalAlignment =CenterVertically) {
            IconButton(onClick = { /*TODO*/ }
                , modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(start = 20.dp)) {
                Icon(imageVector = Icons.Outlined.Bookmark
                    , contentDescription = ""
                    , modifier = Modifier
                        .fillMaxSize()
                )
            }

            Text(text = stringResource(
                id = R.string.settingt)
                , fontSize = 18.sp
                , fontWeight = FontWeight.Bold
                , modifier = Modifier.padding(start = 30.dp)
            )

            Icon(imageVector = Icons.Outlined.Bookmark
                , contentDescription = ""
                , modifier = Modifier
                    .padding(start = 208.dp)
                    .size(20.dp)

            )
        }

                Spacer(modifier = Modifier.height(30.dp))

                TextButton(onClick = { /*TODO*/ }
                    ,colors = ButtonDefaults.textButtonColors(contentColor = LinearGradient,
                        )
                    ,modifier = Modifier.align(CenterHorizontally)
                        ) {
                    Text(text = "Logout")
                    Icon(imageVector = Icons.Outlined.Logout, contentDescription = "")
                }



    }

}