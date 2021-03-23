package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Continue = findViewById<Button>(R.id.b_Continue)
        Continue.setOnClickListener{
            val perehod = Intent(this,Continue::class.java)
            startActivity(perehod)
        }


        val NewGame = findViewById<Button>(R.id.b_NewGame)
        NewGame.setOnClickListener{
            val perehod = Intent(this,NewGame::class.java)
            startActivity(perehod)
        }

        val opsions = findViewById<Button>(R.id.b_opsions)
        opsions.setOnClickListener{
            val perehod = Intent(this,opsions::class.java)
            startActivity(perehod)
        }

        val LoadGame = findViewById<Button>(R.id.b_LoadGame)
        LoadGame.setOnClickListener{
            val perehod = Intent(this,LoadGame::class.java)
            startActivity(perehod)
        }

        val Exit = findViewById<Button>(R.id.b_Exit)
        Exit.setOnClickListener{
            val perehod = Intent(this,Exit::class.java)
            startActivity(perehod)
        }




    }
}
