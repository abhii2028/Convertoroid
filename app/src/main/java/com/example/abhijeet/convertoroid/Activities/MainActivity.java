package com.example.abhijeet.convertoroid.Activities;

import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.abhijeet.convertoroid.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    TextView one,two,three,four,five,six,seven,eight,nine,zero,point,allClear;
    TextView unitOne,unitTwo,left,right;
    Button selectUnit;
    String lefttempString = "",righttempString = "" , whichUnit = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUiElements();
        //InitFont();
        InitSetOnClickListners();

    }



    public void InitUiElements()
    {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        point = findViewById(R.id.point);
        allClear = findViewById(R.id.all_clear);

        unitOne = findViewById(R.id.unit_one);
        unitTwo = findViewById(R.id.unit_two);

        selectUnit = findViewById(R.id.select_unit);

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

    }

   /* public void InitFont()
    {
        Typeface latoRegular = Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        Typeface latoBold = Typeface.createFromAsset(getAssets(),"fonts/Lato-Bold.ttf");
        Typeface latoHairline = Typeface.createFromAsset(getAssets(),"fonts/Lato-Hairline.ttf");
        Typeface latoLight = Typeface.createFromAsset(getAssets(),"fonts/Lato-Light.ttf");
        Typeface latoThin = Typeface.createFromAsset(getAssets(),"fonts/Lato-Thin.ttf");

        selectUnit.setTypeface(latoRegular);

        unitOne.setTypeface(latoHairline);
        unitTwo.setTypeface(latoHairline);

        one.setTypeface(latoThin);
        two.setTypeface(latoThin);
        three.setTypeface(latoThin);
        four.setTypeface(latoThin);
        five.setTypeface(latoThin);
        six.setTypeface(latoThin);
        seven.setTypeface(latoThin);
        eight.setTypeface(latoThin);
        nine.setTypeface(latoThin);
        zero.setTypeface(latoThin);
        point.setTypeface(latoLight);
        allClear.setTypeface(latoLight);

    } */

    public void InitSetOnClickListners() {
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "1";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "1";
                    getEquationAns(righttempString);
                }

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "2";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "2";
                    getEquationAns(righttempString);
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "3";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "3";
                    getEquationAns(righttempString);
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "4";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "4";
                    getEquationAns(righttempString);
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "5";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "5";
                    getEquationAns(righttempString);
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "6";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "6";
                    getEquationAns(righttempString);
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "7";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "7";
                    getEquationAns(righttempString);
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "8";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "8";
                    getEquationAns(righttempString);
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "9";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "9";
                    getEquationAns(righttempString);
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "0";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "0";
                    getEquationAns(righttempString);
                }

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + ".";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + ".";
                    getEquationAns(righttempString);
                }

            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"left"))
                {
                    lefttempString = lefttempString + "c";
                    getEquationAns(lefttempString);
                }
                else
                {
                    righttempString = righttempString + "c";
                    getEquationAns(righttempString);
                }

            }
        });


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "left";
                getWhichUnit(whichUnit);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "right";
                getWhichUnit(whichUnit);
            }
        });
    }

    private void getEquationAns(String tempString) {

       if (Objects.equals(getWhichUnit(whichUnit), "left"))
       {
           unitOne.setText(tempString);
       }
       else
       {
           unitTwo.setText(tempString);
       }

    }

    public String getWhichUnit(String whichUnit) {

        if (Objects.equals(whichUnit,"left"))
        {
           return "left";
        }
        else
        {
            return "right";
        }
    }




}
