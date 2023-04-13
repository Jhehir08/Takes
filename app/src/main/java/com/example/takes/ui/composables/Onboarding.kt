package com.example.takes.ui.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Questionnaire(questions: List<String>) {
    LazyColumn {
        questions.forEach { 
            item { 
                Text(text = it)
            }
        }
    }
}

@Composable
@Preview
fun QuestionnairePreview() {
    "1. What's your name?"
    "2. What would you change it to if you could choose any name?"
    "3. Favorite game"
        "1. Fav object"
        "2. Fav color"
        "3. Fav activity"
    "4. Keep, Trade, Cut"
        "1. Food, Sex, Pets"
        "2. Rock, Rap, Country"
        "3. Sports, Media, Travel"
        "4. Family, Fortune, Fame"
    "5. Respond to the prompt:"
        "1. Someone took your lunch from the employee fridge"
        "2. Passive aggressive text from your parent or partner"
        "3. A social faux pas"
    "6. Give us your best half time speech"
    "7. Roast yourself"
    "8. Initiation..."

    Questionnaire(questions = )
}