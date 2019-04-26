package com.dictionary;

import android.service.autofill.SaveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Savepoint;

public class Addword extends AppCompatActivity {
    EditText edCountry, edCapital;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addword);

        edCapital = findViewById(R.id.edCapital);
        edCountry = findViewById(R.id.edCountry);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });
    }


    private void Save() {
        try {
            PrintStream printStream = new PrintStream(openFileOutput("country.txt", MODE_PRIVATE| MODE_APPEND));
            printStream.println((edCountry.getText().toString() + "->" + edCapital.getText().toString()));
            Toast.makeText(this, "Saved to" + getFilesDir(),Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Log.d("Country app", "Error" + e.toString());
            e.printStackTrace();
        }
    }
}
