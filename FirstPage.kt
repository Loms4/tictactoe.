package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.tictactoe.R.id.move

class FirstPage : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val move = findViewById<Button>(R.id.move)
        move.setOnClickListener{
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }




    }
    fun start(view: View){
        val firstPlayer =findViewById<EditText>(R.id.player1)
        val secondPlayer = findViewById<EditText>(R.id.player2)

        val message1 = firstPlayer.text.toString()
        val message2 = secondPlayer.text.toString()

        val intent =Intent(this,MainActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE1",message1)
            it.putExtra("EXTRA_MESSAGE2",message2)
            startActivity(it)
        }
    }


}