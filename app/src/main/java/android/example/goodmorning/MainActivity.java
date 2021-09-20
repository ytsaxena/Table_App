package android.example.goodmorning;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText num;
     TextView text;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num= findViewById(R.id.num);
        text= findViewById(R.id.textview);
        button = findViewById(R.id.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String result;
                int num1 = Integer.parseInt(num.getText().toString());

                for (int i = 1; i <= 10; i++) {
                    result = (num1 + "      X     " + i + "      =     " + i * num1);
                    text.append("\n" + result);
                }
            }
        });



    }
}