package com.example.modifiers

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scrollState = rememberScrollState()

            Column(
                modifier = Modifier
                    .background(Color(0xFFF5F5F5))
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    text = "Mohammad Salman",
                    style = TextStyle(
                        fontSize = 24.sp,
                        color = Color(0xFF1E88E5),
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 24.sp
                    )
                )
                AdressAndPhone()
                //EmailAndLinkedIn()
                IconLinks()
                Description()
                DescriptionText()
                Education()
                EducationText()
                Skills()
                SkillsText()
                Languages()
                LanguagesText()
            }
        }
    }
}

@Composable
fun AdressAndPhone() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "\u2022 Visakhapatnam, Andhra Pradesh",
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
            )
        )
        Text(
            text = "\u2022 +91 9908587633",
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun IconLinks() {
    val context = LocalContext.current
    val gmailUrl = "mailto:mohammadsalman1999.9.5@gmail.com"
    val linkedinUrl = "https://www.linkedin.com/in/mohammad-salman10"
    val youtubeUrl = "https://www.youtube.com/@Salman_the_listener"
    val gethubUrl = "https://github.com/Mohammadsalman19"

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        // Gmail Row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                val gmIntent = Intent(Intent.ACTION_VIEW, Uri.parse(gmailUrl))
                context.startActivity(gmIntent)
            }
        ) {
            Image(
                painter = painterResource(R.drawable.gmail),
                contentDescription = "Gmail Icon",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Gmail",
                fontSize = 15.sp,
                color = Color(0xFF34A853),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }

        // LinkedIn Row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                val lnIntent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedinUrl))
                context.startActivity(lnIntent)
            }
        ) {
            Image(
                painter = painterResource(R.drawable.linkedin),
                contentDescription = "LinkedIn Icon",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "LinkedIn",
                fontSize = 15.sp,
                color = Color(0xFF0A66C2),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }

        // YouTube Row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                val ytIntent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl))
                context.startActivity(ytIntent)
            }
        ) {
            Image(
                painter = painterResource(R.drawable.youtube),
                contentDescription = "YouTube Icon",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "YouTube",
                fontSize = 15.sp,
                color = Color(0xFFFF0000),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                val ghIntent = Intent(Intent.ACTION_VIEW, Uri.parse(gethubUrl))
                context.startActivity(ghIntent)
            }
        ){
            Image(
                painter = painterResource(R.drawable.gh),
                contentDescription = "GitHub Icon",
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 8.dp)

            )
            Text(
                text = "GitHub",
                fontSize = 15.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}

@Composable
fun Description() {
    Row(modifier = Modifier
        .background(Color(0xFFCFD8DC))
        .fillMaxWidth()
        .padding(7.dp)) {
        Text(
            text = "Description",
            style = TextStyle(fontStyle = androidx.compose.ui.text.font.FontStyle.Normal),
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
    }

@Composable
fun DescriptionText() {
    Text(
        text = "As a motivated and focused individual, I am looking for an " +
                "opportunity to use my analytical and problem-solving skills " +
                "in a supportive team environment. I am eager to make a positive impact " +
                "and develop my abilities to help the organization achieve its goals.",
        style = TextStyle(
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Medium,
            lineHeight = 23.sp // Improves readability
        ),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Justify // Aligns text neatly
    )
}

@Composable
fun Education(){
    Row(modifier = Modifier
        .background(Color(0xFFCED7DB))
        .fillMaxWidth()
        .padding(7.dp)) {
        Text(
            text = "Education",

            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun EducationText() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        EducationItem(
            title = "BSc in MSCS (Mathematics, Statistics and Computer Science)",
            year = "2020 - 2024"
        )
        EducationItem(
            title = "DOA (Diploma in Ophthalmic Assistant)",
            year = "2017 - 2019"
        )
        EducationItem(
            title = "MPC (Mathematics, Physics and Chemistry)",
            year = "2015 - 2017"
        )
        EducationItem(
            title = "10th Class",
            year = "2014 - 2015"
        )
    }
}

@Composable
fun EducationItem(title: String, year: String) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.weight(1f)
        )
        Text(
            text = year,
            style = TextStyle(
                fontSize = 16.sp,
                color = Color(0xFF1E88E5),
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun Skills(){
    Row(modifier = Modifier
        .background(Color(0xFFCFD8DC))
        .fillMaxWidth()
        .padding(7.dp)){
        Text(
            text = "Skills",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )

    }
}

@Composable
fun SkillsText() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        SkillItem(
            title = "Programming Languages:",
            description = "Kotlin, Jetpack Compose, HTML, PHP"
        )
        Spacer(modifier = Modifier.height(8.dp)) // Adds space between items
        SkillItem(
            title = "Tools:",
            description = "Android Studio, Git, Photoshop"
        )
        Spacer(modifier = Modifier.height(8.dp)) // Adds space between items
        SkillItem(
            title = "Soft Skills:",
            description = "Time Management, Teamwork, Communication, Problem Solving"
        )
    }
}

@Composable
fun SkillItem(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1E88E5) // Highlighted color for titles
            ),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = description,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )
    }
}

@Composable
fun Languages(){
    Row(modifier = Modifier
        .background(Color(0xFFCED7DB))
        .fillMaxWidth()
        .padding(7.dp)){
        Text(
            text = "Languages",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun LanguagesText(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)){
        LanguageItem(
            title = "Languages:",
            description = "English, Urdu, Telugu, Hindi"
        )
    }
}

@Composable
fun LanguageItem(title: String, description: String){
    Row(modifier = Modifier
        .padding(vertical = 8.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1E88E5),// Highlighted color for titles
            )
        )
        Text(
            text = description,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        ) }
}


