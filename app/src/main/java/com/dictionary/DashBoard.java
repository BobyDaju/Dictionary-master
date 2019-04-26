package com.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DashBoard extends AppCompatActivity {

    private Button eddisplaycountry, edaddcountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        eddisplaycountry = findViewById(R.id.edDisplayCountry);
        edaddcountry = findViewById(R.id.edAddCountry);


        edaddcountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
            }
        });





    }
}
