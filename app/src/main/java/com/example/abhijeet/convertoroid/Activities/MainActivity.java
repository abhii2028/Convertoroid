package com.example.abhijeet.convertoroid.Activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.abhijeet.convertoroid.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    TextView one,two,three,four,five,six,seven,eight,nine,zero,point,allClear;
    TextView unitOne,unitTwo, up, down,equals;
    ImageView selectUnit;
    String upTempString = "" , downTempString = "" , whichUnit = "" , itemOne = "" , itemTwo = "";
    Double input,result;
    Spinner unitOneSpinner,unitTwoSpinner;
    String[] length = { "Inches", "Feets", "Yards", "Miles", "Millimetres", "Centimetres" , "Metres" , "Kilometres"  };
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUiElements();
        InitFont();
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

        up = findViewById(R.id.up);
        down = findViewById(R.id.down);

        unitOneSpinner = findViewById(R.id.unit_one_spinner);
        unitTwoSpinner = findViewById(R.id.unit_two_spinner);
        equals = findViewById(R.id.equals);


        aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,length);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitOneSpinner.setAdapter(aa);
        unitTwoSpinner.setAdapter(aa);


    }




    public void InitFont()
    {
        Typeface latoRegular = Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        Typeface latoBold = Typeface.createFromAsset(getAssets(),"fonts/Lato-Bold.ttf");
        Typeface latoHairline = Typeface.createFromAsset(getAssets(),"fonts/Lato-Hairline.ttf");
        Typeface latoLight = Typeface.createFromAsset(getAssets(),"fonts/Lato-Light.ttf");
        Typeface latoThin = Typeface.createFromAsset(getAssets(),"fonts/Lato-Thin.ttf");



        unitOne.setTypeface(latoLight);
        unitTwo.setTypeface(latoLight);

        one.setTypeface(latoRegular);
        two.setTypeface(latoRegular);
        three.setTypeface(latoRegular);
        four.setTypeface(latoRegular);
        five.setTypeface(latoRegular);
        six.setTypeface(latoRegular);
        seven.setTypeface(latoRegular);
        eight.setTypeface(latoRegular);
        nine.setTypeface(latoRegular);
        zero.setTypeface(latoRegular);
        point.setTypeface(latoRegular);
        allClear.setTypeface(latoBold);
        up.setTypeface(latoBold);
        down.setTypeface(latoBold);

    }

    public void InitSetOnClickListners() {
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "1";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "1";
                    getEquationAns(downTempString);
                }

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "2";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "2";
                    getEquationAns(downTempString);
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "3";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "3";
                    getEquationAns(downTempString);
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "4";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "4";
                    getEquationAns(downTempString);
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "5";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "5";
                    getEquationAns(downTempString);
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "6";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "6";
                    getEquationAns(downTempString);
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "7";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "7";
                    getEquationAns(downTempString);
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "8";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "8";
                    getEquationAns(downTempString);
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "9";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "9";
                    getEquationAns(downTempString);
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + "0";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + "0";
                    getEquationAns(downTempString);
                }

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = upTempString + ".";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = downTempString + ".";
                    getEquationAns(downTempString);
                }

            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(getWhichUnit(whichUnit),"up"))
                {
                    upTempString = "";
                    getEquationAns(upTempString);
                }
                else
                {
                    downTempString = "";
                    getEquationAns(downTempString);
                }

            }
        });


        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "up";
                getWhichUnit(whichUnit);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "down";
                getWhichUnit(whichUnit);
            }
        });

        selectUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        unitOneSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemOne = parent.getItemAtPosition(position).toString();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unitTwoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemTwo = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                unitTwo.setText(LengthConvert(itemOne,itemTwo).toString());
            }
        });


    }

    private void getEquationAns(String tempString) {

       if (Objects.equals(getWhichUnit(whichUnit), "up"))
       {
           unitOne.setText(tempString);
       }
       else
       {
           unitTwo.setText(tempString);
       }

    }

    public String getWhichUnit(String whichUnit) {

        if (Objects.equals(whichUnit,"up"))
        {
           return "up";
        }
        else
        {
            return "down";
        }

    }



    //Length - conversion
    public Double LengthConvert(String itemOne , String itemTwo)
    {
        input = Double.parseDouble(upTempString);
        result = 0.0d;
        switch(itemOne)
        {
            case "Inches":
            {
                switch(itemTwo)
                {
                    case "Inches":

                        result = input;
                        break;
                    case "Feets":

                        result = input / 12.0d;
                        break;
                    case "Yards":

                        result = input / 36.0d;
                        break;
                    case "Miles":

                        result = input / 63360.0d;
                        break;
                    case "Millimetres":

                        result = input * 25.4d;
                        break;
                    case "Centimetres":

                        result = input * 2.54d;
                        break;
                    case "Metres":

                        result = input * 0.0254d;
                        break;
                    case "Kilometres":

                        result = input * 0.0000254d;
                        break;
                }
                break;
            }
            case "Feets":
            {
                switch(itemTwo)
                {
                    case "Inches":

                        result = input*12.0d;
                        break;
                    case "Feets":

                        result = input;
                        break;
                    case "Yards":

                        result = input/3.0d;
                        break;
                    case "Miles":

                        result = input/5280.0d;
                        break;
                    case "Millimetres":

                        result = input*304.8d;
                        break;
                    case "Centimetres":

                        result = input*30.48d;
                        break;
                    case "Metres":

                        result = input*0.3048d;
                        break;
                    case "Kilometres":

                        result = input*0.0003048d;
                        break;
                }
                break;
            }
            case "Yards":
            {
                switch(itemTwo) {
                    case "Inches":

                        result = input * 36.0d;
                        break;
                    case "Feets":

                        result = input * 3.0d;
                        break;
                    case "Yards":
                        result = input;
                        break;
                    case "Miles":

                        result = input / 1760.0d;
                        break;
                    case "Millimetres":

                        result = input * 914.4d;
                        break;
                    case "Centimetres":

                        result = input*91.44d;
                        break;
                    case "Metres":
                        result = input*0.9144d;
                        break;
                    case "Kilometres":

                        result = input/1093.61d;
                        break;
                }
                break;
            }
            case "Miles":
            {
                switch(itemTwo)
                {
                    case "Inches":

                        result = input*6330.0d;
                        break;
                    case "Feets":

                        result = input*5280.0d;
                        break;
                    case "Yards":

                        result = input*1760.0d;
                        break;
                    case "Miles":
                        result = input;
                        break;
                    case "Millimetres":

                        result = input*1609340.0d;
                        break;
                    case "Centimetres":

                        result = input*160934.0d;
                        break;
                    case "Metres":

                        result = input*1609.34d;
                        break;
                    case "Kilometres":

                        result = input*1.60934d;
                        break;
                }
                break;
            }
            case "Millimetres":
            {
                switch(itemTwo)
                {
                    case "Inches":
                        result = input*25.4d;
                        break;
                    case "Feets":
                        result = input/304.8d;
                        break;
                    case "Yards":
                        result = input/914.4d;
                        break;
                    case "Miles":
                        result = input/1609000.0d;
                        break;
                    case "Millimetres":
                        result = input;
                        break;
                    case "Centimetres":
                        result = input*0.1d;
                        break;
                    case "Metres":
                        result = input*0.001d;
                        break;
                    case "Kilometres":
                        result = input*1e-6d;
                        break;
                }
                break;
            }

            case "Centimetres":
            {
                switch(itemTwo)
                {
                    case "Inches":
                        result = input / 2.54d;
                        break;
                    case "Feets":
                        result = input / 30.48d;
                        break;
                    case "Yards":
                        result = input / 91.44d;
                        break;
                    case "Miles":
                        result = input/160934.0d;
                        break;
                    case "Millimetres":
                        result = input*10d;
                        break;
                    case "Centimetres":
                        result = input;
                        break;
                    case "Metres":
                        result = input*0.01d;
                        break;
                    case "Kilometres":
                        result = input*1e-5d;
                        break;
                }
                break;
            }
            case "Metres":
            {
                switch(itemTwo) {
                    case "Inches":
                        result = input * 39.3701d;
                        break;
                    case "Feets":
                        result = input * 3.28084d;
                        break;
                    case "Yards":
                        result = input*1.09361d;
                        break;
                    case "Miles":
                        result = input/1609.34d;
                        break;
                    case "Millimetres":
                        result = input*1000d;
                        break;
                    case "Centimetres":
                        result = input*100d;
                        break;
                    case "Metres":
                        result = input;
                        break;
                    case "Kilometres":
                        result = input*0.001d;
                        break;
                }
                break;
            }
            case "Kilometres":
            {
                switch(itemTwo)
                {
                    case "Inches":
                        result = input*39370.1d;
                        break;
                    case "Feets":
                        result = input*3280.84d;
                        break;
                    case "Yards":
                        result = input*1093.61d;
                        break;
                    case "Miles":
                        result = input/1.60934d;
                        break;
                    case "Millimetres":
                        result = input*1e+6d;
                        break;
                    case "Centimetres":
                        result = input*100000d;
                        break;
                    case "Metres":
                        result = input*1000d;
                        break;
                    case "Kilometres":
                        result = input;
                        break;
                }
                break;
            }
        }

        return result;

    }

}
