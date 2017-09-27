package com.example.nuengeiei.cs355_asgn1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt1 = (TextView) findViewById(R.id.textView3);
        String extra1 = getIntent().getStringExtra("extra1");
        txt1.setText(extra1);
        TextView txt2 = (TextView) findViewById(R.id.textView5);
        String extra2 = getIntent().getStringExtra("extra2");
        txt1.setText(extra2);
        TextView txt3 = (TextView) findViewById(R.id.textView7);
        String extra3 = getIntent().getStringExtra("extra3");
        txt1.setText(extra3);
        TextView txt4 = (TextView) findViewById(R.id.textView9);
        String extra4 = getIntent().getStringExtra("extra4");
        txt1.setText(extra4);
        TextView txt5 = (TextView) findViewById(R.id.textView11);
        String extra5 = getIntent().getStringExtra("extra5");
        txt1.setText(extra5);
        ImageView imgView= (ImageView)findViewById(R.id. imageView);
        int age = Integer.parseInt(extra3);
        if(age<=15) imgView.setImageResource(R.drawable.young);
        else if(age<=25) imgView.setImageResource(R.drawable.teen);
        else if(age<=60) imgView.setImageResource(R.drawable.working);
        else imgView.setImageResource(R.drawable.old);
    }
}
