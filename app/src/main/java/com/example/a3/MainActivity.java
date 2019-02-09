package com.example.a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    NumberController nc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new NumberController();
        nc.setDisplay((EditText) findViewById(R.id.mainEditText));
    }

    public void onDigitClick(View button){
        Button b = (Button) button;
        nc.addDigit(Integer.parseInt(b.getText().toString()));
    }

    public void onCClick(View button){
        Button b = (Button) button;
        nc.clear();
    }

}
