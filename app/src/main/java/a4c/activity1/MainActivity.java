package a4c.activity1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.plus1);
        Button button2 = (Button) findViewById(R.id.plus3);
        Button button3 = (Button) findViewById(R.id.plus5);
        Button button4 = (Button) findViewById(R.id.Clear);

        final TextView textView = (TextView) findViewById(R.id.count);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(0));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  a = Integer.valueOf(textView.getText().toString());
                a+= 1;
                textView.setText(String.valueOf(a));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  a = Integer.valueOf(textView.getText().toString());
                a+= 3;
                textView.setText(String.valueOf(a));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  a = Integer.valueOf(textView.getText().toString());
                a+= 5;
                textView.setText(String.valueOf(a));
            }
        });
    }
}
