package br.com.sunburn.pedrapapeltesouralagartoespock

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var image = findViewById<ImageView>(R.id.imageView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectRock(view: View?) {
        selectedOption(1)
    }

    fun selectScissor(view: View?) {
        selectedOption(2)
    }

    fun selectPaper(view: View?) {
        selectedOption(3)
    }

    fun selectSpock(view: View?) {
        selectedOption(4)
    }

    fun selectLizard(view: View?) {
        selectedOption(5)
    }

    fun selectedOption(type: Int) {
        val i = machineGaming()
        val text = findViewById<TextView>(R.id.textView)
        if (type == i) {
            text.text = "Draw! Try Again!"
        } else if (type == 1 && i == 2) {
            text.text = "You Win! Rock Crushes Scissors."
            Toast.makeText(applicationContext, "You Win! Rock Crushes Scissors.", Toast.LENGTH_SHORT).show()
        } else if (type == 1 && i == 5) {
            text.text = "You Win! Rock Crushes Lizard."
        } else if (type == 2 && i == 3) {
            text.text = "You Win! Scissors Cuts Paper."
        } else if (type == 2 && i == 5) {
            text.text = "You Win! Scissors Decapitates Lizard."
        } else if (type == 3 && i == 1) {
            text.text = "You Win! Paper Win Rocks."
        } else if (type == 3 && i == 4) {
            text.text = "You Win! Paper Disproves Spock."
        } else if (type == 4 && i == 1) {
            text.text = "You Win! Spock Vapourises Rock."
        } else if (type == 4 && i == 2) {
            text.text = "You Win! Spock Smashes Scissors."
        } else if (type == 5 && i == 4) {
            text.text = "You Win! Lizard Poisons Spock."
        } else if (type == 5 && i == 3) {
            text.text = "You Win! Lizard Eats Paper."
        } else {
            text.text = "You Lose! Try Again!"
        }
    }

    fun machineGaming(): Int {
        image = findViewById(R.id.imageView)
        val number = Random().nextInt(5)
        for (i in 1..5) {
            if (number == 0) {

                image.setImageResource(R.drawable.pedra)
                return 1
            }
            if (number == 1) {
                image.setImageResource(R.drawable.tesoura)
                return 2
            }
            if (number == 2) {
                image.setImageResource(R.drawable.papel)
                return 3
            }
            if (number == 3) {
                image.setImageResource(R.drawable.spock)
                return 4
            }
            if (number == 4) {
                image.setImageResource(R.drawable.lagarto)
                return 5
            }
        }
        return 0
    }
}