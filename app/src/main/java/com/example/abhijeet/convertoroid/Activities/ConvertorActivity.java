package com.example.abhijeet.convertoroid.Activities;

import android.content.Intent;
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

public class ConvertorActivity extends AppCompatActivity {

    TextView one,two,three,four,five,six,seven,eight,nine,zero,point,allClear;
    TextView unitOne,unitTwo, up, down,equals,click,calculator;
    ImageView selectUnit;
    String upTempString = "" , downTempString = "" , whichUnit = "up" , itemOne = "" , itemTwo = "" , whichUnitIsSelected = "LengthUnit";
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
        setContentView(R.layout.activity_convertor);

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

        click = findViewById(R.id.click);
        calculator = findViewById(R.id.calculator);


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
        click.setTypeface(latoThin);

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

        unitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "up";
                getWhichUnit(whichUnit);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "up";
                getWhichUnit(whichUnit);
            }
        });

        unitTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnit = "down";
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

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConvertorActivity.this,CalculatorActivity.class));
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

                calculation();

            }
        });

        unitLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "LengthUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });

        unitVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "VolumeUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });

        unitArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "AreaUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });

        unitTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "TemperatureUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });

        unitWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "WeightUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });

        unitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichUnitIsSelected = "DataUnit";
                Main.setVisibility(View.VISIBLE);
                unitMenu.setVisibility(View.GONE);
                loadActivity();
                unitOne.setText("0");
                unitTwo.setText("0");
                upTempString = "";
                downTempString = "";
            }
        });



    }

    public void calculation()
    {
        if (Objects.equals(upTempString, ""))
        {
            Toast.makeText(ConvertorActivity.this, "Give some input", Toast.LENGTH_SHORT).show();
        }
        else if (Objects.equals(whichUnitIsSelected, "LengthUnit"))
        {
            unitTwo.setText(LengthConvert(itemOne,itemTwo).toString());
        }
        else if (Objects.equals(whichUnitIsSelected, "VolumeUnit"))
        {
            unitTwo.setText(VolumeConvert(itemOne,itemTwo).toString());
        }
        else if (Objects.equals(whichUnitIsSelected, "AreaUnit"))
        {
            unitTwo.setText(AreaConvert(itemOne,itemTwo).toString());
        }
        else if (Objects.equals(whichUnitIsSelected, "TemperatureUnit"))
        {
            unitTwo.setText(TemperatureConvert(itemOne,itemTwo).toString());
        }
        else if (Objects.equals(whichUnitIsSelected, "WeightUnit"))
        {
            unitTwo.setText(WeightConvert(itemOne,itemTwo).toString());
        }
        else if (Objects.equals(whichUnitIsSelected, "DataUnit"))
        {
            unitTwo.setText(DataConvert(itemOne,itemTwo).toString());
        }
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
        input = Double.parseDouble(upTempString);
        result = 0.0d;
        switch (itemOne)
        {
            case "Gallon (us)" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input;
                        break;
                    case "Gallon (uk)" :
                        result = input*0.8326741846d;
                        break;
                    case "Litre" :
                        result = input*3.785411784d;
                        break;
                    case "Millilitre" :
                        result = input*3785.411784d;
                        break;
                    case "Cubic centimetre" :
                        result = input*3785.411784d;
                        break;
                    case "Cubic metre" :
                        result = input*0.0037854118d;
                        break;
                    case "Cubic inch" :
                        result = input*231d;
                        break;
                    case "Cubic foot" :
                        result = input*0.133680556d;
                        break;
                }
                break;
            }
            case "Gallon (uk)" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*1.2009499255d;
                        break;
                    case "Gallon (uk)" :
                        result = input;
                        break;
                    case "Litre" :
                        result = input*4.54609d;
                        break;
                    case "Millilitre" :
                        result = input*4546.09d;
                        break;
                    case "Cubic centimetre" :
                        result = input*4546.09d;
                        break;
                    case "Cubic metre" :
                        result = input*0.00454609d;
                        break;
                    case "Cubic inch" :
                        result = input*277.4194327916d;
                        break;
                    case "Cubic foot" :
                        result = input*0.1605436532d;
                        break;
                }
                break;
            }
            case "Litre" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*0.2641720524d;
                        break;
                    case "Gallon (uk)" :
                        result = input*0.2199692483d;
                        break;
                    case "Litre" :
                        result = input;
                        break;
                    case "Millilitre" :
                        result = input*1000d;
                        break;
                    case "Cubic centimetre" :
                        result = input*1000d;
                        break;
                    case "Cubic metre" :
                        result = input*0.001d;
                        break;
                    case "Cubic inch" :
                        result = input*61.0237440947d;
                        break;
                    case "Cubic foot" :
                        result = input*0.0353146667d;
                        break;
                }
                break;
            }
            case "Millilitre" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*0.000264172d;
                        break;
                    case "Gallon (uk)" :
                        result = input*0.0002199692d;
                        break;
                    case "Litre" :
                        result = input*0.001d;
                        break;
                    case "Millilitre" :
                        result = input;
                        break;
                    case "Cubic centimetre" :
                        result = input*1d;
                        break;
                    case "Cubic metre" :
                        result = input*0.000001d;
                        break;
                    case "Cubic inch" :
                        result = input*0.0610237441d;
                        break;
                    case "Cubic foot" :
                        result = input*0.0000353147d;
                        break;
                }
                break;
            }
            case "Cubic centimetre" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*0.000264172d;
                        break;
                    case "Gallon (uk)" :
                        result = input*0.0002199692d;
                        break;
                    case "Litre" :
                        result = input*0.001d;
                        break;
                    case "Millilitre" :
                        result = input*1d;
                        break;
                    case "Cubic centimetre" :
                        result = input;
                        break;
                    case "Cubic metre" :
                        result = input*0.000001d;
                        break;
                    case "Cubic inch" :
                        result = input*0.0610237441d;
                        break;
                    case "Cubic foot" :
                        result = input*0.0000353147d;
                        break;
                }
                break;
            }
            case "Cubic metre" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*264.1720523581d;
                        break;
                    case "Gallon (uk)" :
                        result = input*219.9692482991d;
                        break;
                    case "Litre" :
                        result = input*1000d;
                        break;
                    case "Millilitre" :
                        result = input*1000000d;
                        break;
                    case "Cubic centimetre" :
                        result = input*1000000d;
                        break;
                    case "Cubic metre" :
                        result = input;
                        break;
                    case "Cubic inch" :
                        result = input*61023.744094732d;
                        break;
                    case "Cubic foot" :
                        result = input*35.3146667215d;
                        break;
                }
                break;
            }
            case "Cubic inch" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*0.0043290043d;
                        break;
                    case "Gallon (uk)" :
                        result = input*0.0036046501d;
                        break;
                    case "Litre" :
                        result = input*0.016387064d;
                        break;
                    case "Millilitre" :
                        result = input*16.387064d;
                        break;
                    case "Cubic centimetre" :
                        result = input*16.387064d;
                        break;
                    case "Cubic metre" :
                        result = input*0.0000163871d;
                        break;
                    case "Cubic inch" :
                        result = input;
                        break;
                    case "Cubic foot" :
                        result = input*0.0005787037d;
                        break;
                }
                break;
            }
            case "Cubic foot" :
            {
                switch (itemTwo)
                {
                    case "Gallon (us)" :
                        result = input*7.4805194805d;
                        break;
                    case "Gallon (uk)" :
                        result = input*6.228835459d;
                        break;
                    case "Litre" :
                        result = input*28.316846592d;
                        break;
                    case "Millilitre" :
                        result = input*28316.846592d;
                        break;
                    case "Cubic centimetre" :
                        result = input*28316.846592d;
                        break;
                    case "Cubic metre" :
                        result = input*0.0283168466d;
                        break;
                    case "Cubic inch" :
                        result = input*1728d;
                        break;
                    case "Cubic foot" :
                        result = input;
                        break;
                }
                break;
            }

        }
        return result;
    }

    //Area - conversion
    public Double AreaConvert(String itemOne, String itemTwo)
    {
        input = Double.parseDouble(upTempString);
        result = 0.0d;
        switch (itemOne)
        {
            case "Acre" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input;
                        break;
                    case "Are" :
                        result = input*40.468564224d;
                        break;
                    case "Hectare" :
                        result = input*0.4046856422d;
                        break;
                    case "Square centimetre" :
                        result = input*40468564.224d;
                        break;
                    case "Square foot" :
                        result = input*43560d;
                        break;
                    case "Square inch" :
                        result = input*6272640d;
                        break;
                    case "Square metre" :
                        result = input*4046.8564224d;
                        break;

                }
                break;
            }
            case "Are" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*0.0247105381d;
                        break;
                    case "Are" :
                        result = input;
                        break;
                    case "Hectare" :
                        result = input*0.01d;
                        break;
                    case "Square centimetre" :
                        result = input*1000000d;
                        break;
                    case "Square foot" :
                        result = input*1076.391041671d;
                        break;
                    case "Square inch" :
                        result = input*155000.31000062d;
                        break;
                    case "Square metre" :
                        result = input*100d;
                        break;

                }
                break;
            }
            case "Hectare" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*2.4710538147d;
                        break;
                    case "Are" :
                        result = input*100d;
                        break;
                    case "Hectare" :
                        result = input;
                        break;
                    case "Square centimetre" :
                        result = input*100000000d;
                        break;
                    case "Square foot" :
                        result = input*107639.10416709d;
                        break;
                    case "Square inch" :
                        result = input*15500031.000062d;
                        break;
                    case "Square metre" :
                        result = input*10000d;
                        break;

                }
                break;
            }
            case "Square centimetre" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*2.47105381e-8d;
                        break;
                    case "Are" :
                        result = input*0.000001d;
                        break;
                    case "Hectare" :
                        result = input*0.00000001d;
                        break;
                    case "Square centimetre" :
                        result = input;
                        break;
                    case "Square foot" :
                        result = input*0.001076391d;
                        break;
                    case "Square inch" :
                        result = input*0.15500031d;
                        break;
                    case "Square metre" :
                        result = input*0.0001d;
                        break;

                }
                break;
            }
            case "Square foot" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*0.0000229568d;
                        break;
                    case "Are" :
                        result = input*0.0009290304d;
                        break;
                    case "Hectare" :
                        result = input*0.0000092903d;
                        break;
                    case "Square centimetre" :
                        result = input*929.0304d;
                        break;
                    case "Square foot" :
                        result = input;
                        break;
                    case "Square inch" :
                        result = input*144d;
                        break;
                    case "Square metre" :
                        result = input*0.09290304d;
                        break;

                }
                break;
            }
            case "Square inch" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*1.59422508e-7d;
                        break;
                    case "Are" :
                        result = input*0.0000064516d;
                        break;
                    case "Hectare" :
                        result = input*0.0000000645d;
                        break;
                    case "Square centimetre" :
                        result = input*6.4516d;
                        break;
                    case "Square foot" :
                        result = input*0.0069444444d;
                        break;
                    case "Square inch" :
                        result = input;
                        break;
                    case "Square metre" :
                        result = input*0.00064516d;
                        break;

                }
                break;
            }
            case "Square metre" :
            {
                switch (itemTwo)
                {
                    case "Acre" :
                        result = input*0.0002471054d;
                        break;
                    case "Are" :
                        result = input*0.01d;
                        break;
                    case "Hectare" :
                        result = input*0.0001d;
                        break;
                    case "Square centimetre" :
                        result = input*10000d;
                        break;
                    case "Square foot" :
                        result = input*10.7639104167d;
                        break;
                    case "Square inch" :
                        result = input*1550.0031000062d;
                        break;
                    case "Square metre" :
                        result = input;
                        break;

                }
                break;
            }

        }
        return result;
    }

    //Temperature - conversion
    public Double TemperatureConvert(String itemOne, String itemTwo)
    {
        input = Double.parseDouble(upTempString);
        result = 0.0d;

        switch (itemOne)
        {
            case "Celsius" :
            {
                switch (itemTwo)
                {
                    case "Celsius" :
                        result = input;
                        break;
                    case "Fahrenheit" :
                        result = input*1.8+32;
                        break;
                    case "Kelvin" :
                        result = input+273.15;
                        break;
                }
                break;
            }

            case "Fahrenheit" :
            {
                switch (itemTwo)
                {
                    case "Celsius" :
                        result = (input-32)*0.556;
                        break;
                    case "Fahrenheit" :
                        result = input;
                        break;
                    case "Kelvin" :
                        result = (input + 459.67)* 5/9;
                        break;
                }
                break;
            }

            case "Kelvin" :
            {
                switch (itemTwo)
                {
                    case "Celsius" :
                        result = input - 273.15;
                        break;
                    case "Fahrenheit" :
                        result = (input - 273.15) * 9/5 + 32;
                        break;
                    case "Kelvin" :
                        result = input;
                        break;
                }
                break;
            }
        }

        return result;
    }

    //Weight - conversion
    public Double WeightConvert(String itemOne, String itemTwo)
    {
        input = Double.parseDouble(upTempString);
        result = 0.0d;

        switch (itemOne)
        {
            case "Ton" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input;
                        break;
                    case "Ton (us)" :
                        result = input*1.1023113109d;
                        break;
                    case "Ton (uk)" :
                        result = input*0.9842065276d;
                        break;
                    case "Pound" :
                        result = input*2204.6226218488d;
                        break;
                    case "Ounce" :
                        result = input*35273.96194958d;
                        break;
                    case "Kilogram" :
                        result = input*1000d;
                        break;
                    case "Gram" :
                        result = input*1000000d;
                        break;
                }
                break;
            }

            case "Ton (us)" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*0.90718474d;
                        break;
                    case "Ton (us)" :
                        result = input;
                        break;
                    case "Ton (uk)" :
                        result = input*0.8928571429d;
                        break;
                    case "Pound" :
                        result = input*2000d;
                        break;
                    case "Ounce" :
                        result = input*32000d;
                        break;
                    case "Kilogram" :
                        result = input*907.18474d;
                        break;
                    case "Gram" :
                        result = input*907184.74d;
                        break;
                }
                break;
            }

            case "Ton (uk)" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*1.0160469088d;
                        break;
                    case "Ton (us)" :
                        result = input*1.12d;
                        break;
                    case "Ton (uk)" :
                        result = input;
                        break;
                    case "Pound" :
                        result = input*2240d;
                        break;
                    case "Ounce" :
                        result = input*35840d;
                        break;
                    case "Kilogram" :
                        result = input*1016.0469088d;
                        break;
                    case "Gram" :
                        result = input*1016046.9088d;
                        break;
                }
                break;
            }

            case "Pound" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*0.0004535924d;
                        break;
                    case "Ton (us)" :
                        result = input*0.0005d;
                        break;
                    case "Ton (uk)" :
                        result = input*0.0004464286d;
                        break;
                    case "Pound" :
                        result = input;
                        break;
                    case "Ounce" :
                        result = input*16d;
                        break;
                    case "Kilogram" :
                        result = input*0.45359237d;
                        break;
                    case "Gram" :
                        result = input*453.59237d;
                        break;
                }
                break;
            }

            case "Ounce" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*0.0000283495d;
                        break;
                    case "Ton (us)" :
                        result = input*0.00003125d;
                        break;
                    case "Ton (uk)" :
                        result = input*0.0000279017d;
                        break;
                    case "Pound" :
                        result = input*0.0625d;
                        break;
                    case "Ounce" :
                        result = input;
                        break;
                    case "Kilogram" :
                        result = input*0.0283495231d;
                        break;
                    case "Gram" :
                        result = input*28.349523125d;
                        break;
                }
                break;
            }

            case "Kilogram" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*0.001d;
                        break;
                    case "Ton (us)" :
                        result = input*0.0011023113d;
                        break;
                    case "Ton (uk)" :
                        result = input*0.0009842065d;
                        break;
                    case "Pound" :
                        result = input*2.2046226218d;
                        break;
                    case "Ounce" :
                        result = input*35.2739619496d;
                        break;
                    case "Kilogram" :
                        result = input;
                        break;
                    case "Gram" :
                        result = input*1000d;
                        break;
                }
                break;
            }

            case "Gram" :
            {
                switch (itemTwo)
                {
                    case "Ton" :
                        result = input*0.000001d;
                        break;
                    case "Ton (us)" :
                        result = input*0.0000011023d;
                        break;
                    case "Ton (uk)" :
                        result = input*0.0000009842d;
                        break;
                    case "Pound" :
                        result = input*0.0022046226d;
                        break;
                    case "Ounce" :
                        result = input*0.0352739619d;
                        break;
                    case "Kilogram" :
                        result = input*0.001d;
                        break;
                    case "Gram" :
                        result = input;
                        break;
                }
                break;
            }
        }

        return result;
    }

    //Data - conversion
    public Double DataConvert(String itemOne, String itemTwo)
    {
        input = Double.parseDouble(upTempString);
        result = 0.0d;

        switch (itemOne)
        {
            case "Bit" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input;
                        break;
                    case "Byte" :
                        result = input*0.125d;
                        break;
                    case "Kilobyte" :
                        result = input*0.0001220703d;
                        break;
                    case "Megabyte" :
                        result = input*1.19209290e-7d;
                        break;
                    case "Gigabyte" :
                        result = input*1.16415922e-10d;
                        break;
                    case "Terabyte" :
                        result = input*1.13686838e-13d;
                        break;
                }
                break;
            }

            case "Byte" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input*8d;
                        break;
                    case "Byte" :
                        result = input;
                        break;
                    case "Kilobyte" :
                        result = input*0.0009765625d;
                        break;
                    case "Megabyte" :
                        result = input*0.0000009537d;
                        break;
                    case "Gigabyte" :
                        result = input*0.0000000009d;
                        break;
                    case "Terabyte" :
                        result = input*9.09494702e-13d;
                        break;
                }
                break;
            }

            case "Kilobyte" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input*8192d;
                        break;
                    case "Byte" :
                        result = input*1024d;
                        break;
                    case "Kilobyte" :
                        result = input;
                        break;
                    case "Megabyte" :
                        result = input*0.0009765625d;
                        break;
                    case "Gigabyte" :
                        result = input*0.0000009537d;
                        break;
                    case "Terabyte" :
                        result = input*0.0000000009d;
                        break;
                }
                break;
            }

            case "Megabyte" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input*8388608d;
                        break;
                    case "Byte" :
                        result = input*1048576d;
                        break;
                    case "Kilobyte" :
                        result = input*1024d;
                        break;
                    case "Megabyte" :
                        result = input;
                        break;
                    case "Gigabyte" :
                        result = input*0.0009765625d;
                        break;
                    case "Terabyte" :
                        result = input*0.0000009537d;
                        break;
                }
                break;
            }

            case "Gigabyte" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input*8589934592d;
                        break;
                    case "Byte" :
                        result = input*1073741824d;
                        break;
                    case "Kilobyte" :
                        result = input*1048576d;
                        break;
                    case "Megabyte" :
                        result = input*1024;
                        break;
                    case "Gigabyte" :
                        result = input;
                        break;
                    case "Terabyte" :
                        result = input*0.0009765625d;
                        break;
                }
                break;
            }

            case "Terabyte" :
            {
                switch (itemTwo)
                {
                    case "Bit" :
                        result = input*8796093022208d;
                        break;
                    case "Byte" :
                        result = input*1099511627776d;
                        break;
                    case "Kilobyte" :
                        result = input*1073741824d;
                        break;
                    case "Megabyte" :
                        result = input*1048576d;
                        break;
                    case "Gigabyte" :
                        result = input*1024d;
                        break;
                    case "Terabyte" :
                        result = input;
                        break;
                }
                break;
            }


        }

        return result;
    }

}
