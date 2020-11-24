package com.example.hw14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button d4_button;
    private Button d6_button;
    private Button d8_button;
    private Button d10_button;
    private Button d12_button;
    private Button d20_button;
    private Button zero_button;
    private Button one_button;
    private Button two_button;
    private Button three_button;
    private Button four_button;
    private Button five_button;
    private Button six_button;
    private Button seven_button;
    private Button eight_button;
    private Button nine_button;
    private Button roll_button;
    private TextView total_tv;
    private TextView output_tv;
    private TextView numberOfRolls_tv;
    private TextView diceType_tv;
    private TextView percentile_tv;
    private int numberOfSides;
    private int numberOfRolls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.d4_button = this.findViewById(R.id.d4_button);
        this.d6_button = this.findViewById(R.id.d6_button);
        this.d8_button = this.findViewById(R.id.d8_button);
        this.d10_button = this.findViewById(R.id.d10_button);
        this.d12_button = this.findViewById(R.id.d12_button);
        this.d20_button = this.findViewById(R.id.d20_button);
        this.zero_button = this.findViewById(R.id.zero_button);
        this.one_button = this.findViewById(R.id.one_button);
        this.two_button = this.findViewById(R.id.two_button);
        this.three_button = this.findViewById(R.id.three_button);
        this.four_button = this.findViewById(R.id.four_button);
        this.five_button = this.findViewById(R.id.five_button);
        this.six_button = this.findViewById(R.id.six_button);
        this.seven_button = this.findViewById(R.id.seven_button);
        this.eight_button = this.findViewById(R.id.eight_button);
        this.nine_button = this.findViewById(R.id.nine_button);
        this.roll_button = this.findViewById(R.id.roll_button);
        this.total_tv = this.findViewById(R.id.total_tv);
        this.output_tv = this.findViewById(R.id.output_tv);
        this.numberOfRolls_tv = this.findViewById(R.id.numberOfRolls_tv);
        this.diceType_tv = this.findViewById(R.id.diceType_tv);
        this.percentile_tv = this.findViewById(R.id.percentile_tv);
        this.numberOfSides = numberOfSides;
        this.numberOfRolls = numberOfRolls;
    }

    public void onButtonClicked(View v)
    {
        int total = 0;
        String temp = "";
        if(v == this.d4_button)
        {
            this.diceType_tv.setText("D4");
            this.numberOfSides = 4;
        }
        else if(v == this.d6_button)
        {
            this.diceType_tv.setText("D6");
            this.numberOfSides = 6;
        }
        else if(v == this.d8_button)
        {
            this.diceType_tv.setText("D8");
            this.numberOfSides = 8;
        }
        else if(v == this.d10_button)
        {
            this.diceType_tv.setText("D10");
            this.numberOfSides = 10;
        }
        else if(v == this.d12_button)
        {
            this.diceType_tv.setText("D12");
            this.numberOfSides = 12;
        }
        else if(v == this.d20_button)
        {
            this.diceType_tv.setText("D20");
            this.numberOfSides = 20;
        }
        else if(v == this.zero_button)
        {
            this.numberOfRolls_tv.setText("0");
            this.numberOfRolls = 0;
        }
        else if(v == this.one_button)
        {
            this.numberOfRolls_tv.setText("1");
            this.numberOfRolls = 1;
        }
        else if(v == this.two_button)
        {
            this.numberOfRolls_tv.setText("2");
            this.numberOfRolls = 2;
        }
        else if(v == this.three_button)
        {
            this.numberOfRolls_tv.setText("3");
            this.numberOfRolls = 3;
        }
        else if(v == this.four_button)
        {
            this.numberOfRolls_tv.setText("4");
            this.numberOfRolls = 4;
        }
        else if(v == this.five_button)
        {
            this.numberOfRolls_tv.setText("5");
            this.numberOfRolls = 5;
        }
        else if(v == this.six_button)
        {
            this.numberOfRolls_tv.setText("6");
            this.numberOfRolls = 6;
        }
        else if(v == this.seven_button)
        {
            this.numberOfRolls_tv.setText("7");
            this.numberOfRolls = 7;
        }
        else if(v == this.eight_button)
        {
            this.numberOfRolls_tv.setText("8");
            this.numberOfRolls = 8;
        }
        else if(v == this.nine_button)
        {
            this.numberOfRolls_tv.setText("9");
            this.numberOfRolls = 9;
        }
        else if(v == this.roll_button)
        {
            Dice[] theDice = new Dice[numberOfRolls];
            for(int i = 0; i < theDice.length-1; i++)
            {
                theDice[i] = new Dice(numberOfSides);
            }
            int[] diceResults = new int[numberOfRolls];
            for(int x = 0; x < diceResults.length-1; x++)
            {
                int numberRolled = theDice[x].roll();
                diceResults[x] = numberRolled;
            }
            for(int j = 0; j < diceResults.length-1; j++)
            {
                if(j == 0)
                {
                    temp = (temp + Integer.toString(diceResults[j]));
                }
                else
                {
                    temp = (temp +  " + " + Integer.toString(diceResults[j]));
                }
                total = total + diceResults[j];
            }
            this.output_tv.setText(temp);
            this.total_tv.setText(Integer.toString(total));
        }
    }
}
 //if(v == this.d4_button)
         //{
         //Dice d4 = new Dice(4);
         //this.total_tv.setText("" + d4.roll());
         //}