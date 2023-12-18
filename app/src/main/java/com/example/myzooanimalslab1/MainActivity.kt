package com.example.myzooanimalslab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Створення об'єктів Cat
        val Mike = Dog("Mike", "A black old dog", R.drawable.mike)
        val Diaz = Dog("Diaz", "Husky dog", R.drawable.diaz)
        val Jack = Dog("Jack", "The grayish mongrel Jack", R.drawable.jack)

        // Знаходження кнопок в макеті
        val buttonDetailsMike = findViewById<Button>(R.id.DogTwoDetails)
        val buttonDetailsDiaz = findViewById<Button>(R.id.DogOneDetails)
        val buttonDetailsJack = findViewById<Button>(R.id.DogThreeDetails)

        // Встановлення обробників натискань для кнопок
        buttonDetailsMike.setOnClickListener{
            LoadDescription(Mike.name, Mike.description)
        }
        buttonDetailsDiaz.setOnClickListener{
            LoadDescription(Diaz.name, Diaz.description)
        }
        buttonDetailsJack.setOnClickListener{
            LoadDescription(Jack.name, Jack.description)
        }
    }

    // Функція для завантаження опису кота
    private fun LoadDescription(name: String, description: String) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("dogName", name)
        intent.putExtra("dogDescription", description)
        startActivity(intent)
    }
}
