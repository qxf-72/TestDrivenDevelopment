package cn.edu.jnu.x2021102308;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button calculate;
    private TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editTextText);
        calculate = findViewById(R.id.calculate);
        score = findViewById(R.id.score);

        calculate.setOnClickListener(v -> {
            score.setText(String.valueOf(calculateScore()));
        });

    }

    int calculateScore() {
        String input = this.input.getText().toString();
        String[] strArray = input.split(",");
        int[] pins = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            pins[i] = Integer.parseInt(strArray[i]);
        }
        BowlingGame game = new BowlingGame();
        for (int pin : pins) {
            game.roll(pin);
        }
        return game.score();
    }
}