package android.example.com.codingchallengelab21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button = findViewById(R.id.button_two);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button = findViewById(R.id.button_three);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });


    }

    public void secondPage(View view) {

    }

    public void thirdPage(View view) {

    }

    public void fourthPage(View view) {

    }

    public void openActivity2() {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, ThirdPage.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, FourthPage.class);
        startActivity(intent);
    }
}
