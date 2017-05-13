package com.example.parktaejun.tamago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView egg;
    private TextView text;
    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egg = (ImageView)findViewById(R.id.egg);
        text = (TextView)findViewById(R.id.text);

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                if(num == 100){
                    Toast.makeText(MainActivity.this, "YEAH!", Toast.LENGTH_SHORT).show();
                    text.setText("빠밤!");
                } else{
                    text.setText(num);
                }
            }
        });

    }
}
