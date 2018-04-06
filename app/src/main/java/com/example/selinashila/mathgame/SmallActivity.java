package com.example.selinashila.mathgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SmallActivity extends AppCompatActivity {
    private TextView welcomView, pointView;
    private Button btnOne, btnTwo, btnThree, btnFour;
    int IncValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);

        WelcomeArea();
        RandomArea();
        PointViewArea();
    }

    private void WelcomeArea() {
        welcomView = (TextView) findViewById(R.id.welcomView);

        welcomView.setText("Welcome: "+getIntent().getStringExtra("passName"));
    }

    private void RandomArea() {
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);

        Random random = new Random();
        int pickedNumber1 = random.nextInt(999);
        int pickedNumber2 = random.nextInt(999);
        int pickedNumber3 = random.nextInt(999);
        int pickedNumber4 = random.nextInt(999);

        btnOne.setText(String.valueOf(pickedNumber1));
        btnTwo.setText(String.valueOf(pickedNumber2));
        btnThree.setText(String.valueOf(pickedNumber3));
        btnFour.setText(String.valueOf(pickedNumber4));
    }

    private void PointViewArea() {
        pointView = (TextView) findViewById(R.id.pointView);
        pointView.setText(String.valueOf("Point: " + IncValue));
    }

    public void buttonOne(View view) {
        int btn1 = Integer.valueOf(btnOne.getText().toString());
        int btn2 = Integer.valueOf(btnTwo.getText().toString());
        int btn3 = Integer.valueOf(btnThree.getText().toString());
        int btn4 = Integer.valueOf(btnFour.getText().toString());
        if (btn1 < btn2 && btn1 < btn3 && btn1 < btn4){
            Toast.makeText(this, "Correct...", Toast.LENGTH_SHORT).show();
            IncValue++;
        }else {
            Toast.makeText(this, "Wrong...", Toast.LENGTH_SHORT).show();
            IncValue--;
        }
        RandomArea();
        PointViewArea();
    }

    public void buttonTwo(View view) {
        int btn1 = Integer.valueOf(btnOne.getText().toString());
        int btn2 = Integer.valueOf(btnTwo.getText().toString());
        int btn3 = Integer.valueOf(btnThree.getText().toString());
        int btn4 = Integer.valueOf(btnFour.getText().toString());
        if (btn2 < btn1 && btn2 < btn3 && btn2 < btn4){
            Toast.makeText(this, "Correct...", Toast.LENGTH_SHORT).show();
            IncValue++;
        }else {
            Toast.makeText(this, "Wrong...", Toast.LENGTH_SHORT).show();
            IncValue--;
        }
        RandomArea();
        PointViewArea();
    }

    public void buttonThree(View view) {
        int btn1 = Integer.valueOf(btnOne.getText().toString());
        int btn2 = Integer.valueOf(btnTwo.getText().toString());
        int btn3 = Integer.valueOf(btnThree.getText().toString());
        int btn4 = Integer.valueOf(btnFour.getText().toString());
        if (btn3 < btn1 && btn3 < btn2 && btn3 < btn4){
            Toast.makeText(this, "Correct...", Toast.LENGTH_SHORT).show();
            IncValue++;
        }else {
            Toast.makeText(this, "Wrong...", Toast.LENGTH_SHORT).show();
            IncValue--;
        }
        RandomArea();
        PointViewArea();
    }

    public void buttonFour(View view) {
        int btn1 = Integer.valueOf(btnOne.getText().toString());
        int btn2 = Integer.valueOf(btnTwo.getText().toString());
        int btn3 = Integer.valueOf(btnThree.getText().toString());
        int btn4 = Integer.valueOf(btnFour.getText().toString());
        if (btn4 < btn2 && btn4 < btn3 && btn4 < btn1){
            Toast.makeText(this, "Correct...", Toast.LENGTH_SHORT).show();
            IncValue++;
        }else {
            Toast.makeText(this, "Wrong...", Toast.LENGTH_SHORT).show();
            IncValue--;
        }
        RandomArea();
        PointViewArea();
    }
    }
