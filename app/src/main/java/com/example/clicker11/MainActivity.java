package com.example.clicker11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private Button b1;
    private Button b2;
    private int score = 0;
    private Switch s1;
    private Boolean tr= true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       t1 = findViewById(R.id.Point);
       b1 = findViewById(R.id.click);
       b2 = findViewById(R.id.reset);
       s1= findViewById(R.id.switch1);
       //String sc = String.valueOf(score);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if(tr){
                   score++;
                   t1.setText(score+"");
                   b1.setText("+1");
               } else {
                   score--;
                   t1.setText(score+"");

               }
           }
       });

       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               score = 0;
               t1.setText(score +"");
           }
       });
       s1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               tr= !tr;
               if(tr){
                   s1.setText("Tryb dodatni");
                   b1.setText("+1");
               }else {
                   s1.setText("Tryb ujemny");
                   b1.setText("-1");
               }
           }
       });


    }
}