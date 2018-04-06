package com.example.selinashila.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HintActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);

        btnSkip = (ImageView) findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSkip){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
