package br.com.sunburn.pedrapapeltesouralagartoespock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view){
        this.selectedOption(1);

    }
    public void selectScissor(View view){
        selectedOption(2);

    }
    public void selectPaper(View view){
        selectedOption(3);

    }
    public void selectSpock(View view){
        selectedOption(4);
    }
    public void selectLizard(View view){
        selectedOption(5);

    }

    public void selectedOption(int type){
        int i = machineGaming();
        TextView text = findViewById(R.id.textView);
        if(type == i){
              text.setText("Draw! Try Again!");
        }
        else  if(type == 1 && i == 2){
            text.setText("You Win! Rock Crushes Scissors.");
            Toast.makeText(getApplicationContext(),"You Win! Rock Crushes Scissors.", Toast.LENGTH_SHORT ).show();
        }
        else  if(type == 1 && i == 5){
            text.setText("You Win! Rock Crushes Lizard.");
        }
        else  if(type == 2 && i == 3){
            text.setText("You Win! Scissors Cuts Paper.");
        }
        else  if(type == 2 && i == 5){
            text.setText("You Win! Scissors Decapitates Lizard.");
        }
        else   if(type == 3 && i == 1){
            text.setText("You Win! Paper Win Rocks.");
        }
        else if(type == 3 && i == 4){
            text.setText("You Win! Paper Disproves Spock.");
        }
        else  if(type == 4 && i == 1){
            text.setText("You Win! Spock Vapourises Rock.");
        }
        else  if(type == 4 && i == 2){
            text.setText("You Win! Spock Smashes Scissors.");
        }
        else if (type == 5 && i == 4){
            text.setText("You Win! Lizard Poisons Spock.");
        }
        else if(type == 5 && i == 3){
            text.setText("You Win! Lizard Eats Paper.");
        }else{
            text.setText("You Lose! Try Again!");
        }

    }

    public int machineGaming(){
        image = findViewById(R.id.imageView);
        int number = new Random().nextInt(5);
        for(int i=1; i<6; i++){
            if(number == 0){
                image.setImageResource(R.drawable.pedra);
                return 1;
            }
            if(number == 1){
                image.setImageResource(R.drawable.tesoura);
                return 2;
            }
            if(number == 2){
                image.setImageResource(R.drawable.papel);
                return 3;
            }
            if(number == 3){
                image.setImageResource(R.drawable.spock);
                return 4;
            }
            if(number == 4){
                image.setImageResource(R.drawable.lagarto);
                return 5;
            }

        }return 0;

    }

}

