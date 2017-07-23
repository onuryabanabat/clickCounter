package com.example.onur.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int b=5;
    }

    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.textView3);
        quantityTextView.setText(""+number);
    }

    public void submitCount(View view){
        count++;
        display(count);

    }

}
