package com.example.abhijeet.convertoroid.Activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abhijeet.convertoroid.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    TextView one,two,three,four,five,six,seven,eight,nine,zero,point,allClear;
    TextView unitOne,unitTwo, up, down,equals;
    ImageView selectUnit;
    String upTempString = "" , downTempString = "" , whichUnit = "down" , itemOne = "" , itemTwo = "" , whichUnitIsSelected = "LengthUnit";
    Double input,result;
    Spinner unitOneSpinner,unitTwoSpinner;
    String[] length = { "Inches", "Feets", "Yards", "Miles", "Millimetres", "Centimetres" , "Metres" , "Kilometres"  };
    String[] volume = { "Gallon (us)" , "Gallon (uk)" , "Litre" , "Millilitre" , "Cubic centimetre" , "Cubic metre" , "Cubic inch" , "Cubic foot"};
    String[] area = { "Acre" , "Are" , "Hectare" , "Square centimetre" , "Square foot" , "Square inch" , "Square metre" };
    String[] temperature = { "Celsius" , "Fahrenheit" , "Kelvin" };
    String[] weight = { "Ton" , "Ton (us)" , "Ton (uk)" , "Pound" , "Ounce" , "Kilogram" , "Gram" };
    String[] data = { "Bit" , "Byte" , "Kilobyte" , "Megabyte" , "Gigabyte" , "Terabyte" };
    ArrayAdapter adapter;
    ImageView unitLength,unitVolume,unitArea,unitTemperature,unitWeight,unitData;
    LinearLayout unitMenu,Main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadActivity();

    }

    public void loadActivity()
    {
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

        unitLength = findViewById(R.id.unit_length);
        unitVolume = findViewById(R.id.unit_volume);
        unitArea = findViewById(R.id.unit_area);
        unitTemperature = findViewById(R.id.unit_temperature);
        unitWeight = findViewById(R.id.unit_weight);
        unitData = findViewById(R.id.unit_data);

        unitMenu = findViewById(R.id.unit_menu);
        Main = findViewById(R.id.main);


        switch (whichUnitIsSelected)
        {
            case "LengthUnit" : //lengthAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,length);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;

            case "VolumeUnit" : //volumeAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,volume);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;

            case "AreaUnit" : //volumeAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,area);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;

            case "TemperatureUnit" : //volumeAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,temperature);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;

            case "WeightUnit" : //volumeAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,weight);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;

            case "DataUnit" : //volumeAdapter
                adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,data);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unitOneSpinner.setAdapter(adapter);
                unitTwoSpinner.setAdapter(adapter);
                break;



        }


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
                Main.setVisibility(View.GONE);
                unitMenu.setVisibility(View.VISIBLE);
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

                if (Objects.equals(upTempString, "") && Objects.equals(downTempString, ""))
                {
                    Toast.makeText(MainActivity.this, "Give some input", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    unitTwo.setText(LengthConvert(itemOne,itemTwo).toString());
                }

            }
        });

        unitLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "LengthUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
            }
        });

        unitVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "VolumeUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
            }
        });

        unitArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "AreaUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
            }
        });

        unitTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "TemperatureUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
            }
        });

        unitWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "WeightUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
            }
        });

        unitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "DataUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
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

    //Volume - conversion
    public Double VolumeConvert(String itemOne, String itemTwo)
    {
        return result;
    }

}
