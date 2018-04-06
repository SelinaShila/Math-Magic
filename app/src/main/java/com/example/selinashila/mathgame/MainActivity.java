package com.example.selinashila.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView btnPlay, btnHint;
    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (ImageView) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);

        btnHint = (ImageView) findViewById(R.id.btnHint);
        btnHint.setOnClickListener(this);

        editName = (EditText) findViewById(R.id.editName);
    }

    @Override
    public void onClick(View v) {
        String passValue = editName.getText().toString();

        if (v.getId() == R.id.btnPlay){
            if (passValue.equals("")){
                Toast.makeText(getApplicationContext(),"Insert Your Name...",Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(this, SmallActivity.class);
                intent.putExtra("passName", passValue);
                startActivity(intent);
            }
        }else if (v.getId() == R.id.btnHint){
            Intent intent = new Intent(this, HintActivity.class);
            startActivity(intent);
        }
    }}
