package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.foodorder.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    final Calendar myCalendar= Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.endtimeset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timepicker();
            }
        });
        binding.startsettime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timepicker();
            }
        });


        ArrayList<module> list = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));

        Madapter adapter = new Madapter(list, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        DatePickerDialog.OnDateSetListener date = (view, year, month, day) -> {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH,month);
            myCalendar.set(Calendar.DAY_OF_MONTH,day);
            updateLabel();
        };

        binding.backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitedapp();
            }
        });

        binding.date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this,date,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        binding.timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timepicker();
            }
        });


    }


    private void updateLabel() {
        String myFormat="dd/mm/yy";
        SimpleDateFormat dateFormat=new SimpleDateFormat(myFormat, Locale.US);
        binding.setdate.setText(dateFormat.format(myCalendar.getTime()));

    }




    public void timepicker()
    {
        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        int AM_PM = mcurrentTime.get(Calendar.AM_PM);
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {

            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {

                if (selectedHour<12)
                {
                    binding.startsettime.setText( selectedHour + ":" + selectedMinute+" "+" AM");
                }
                else
                    binding.startsettime.setText( selectedHour + ":" + selectedMinute+" "+" PM");





            }
        }, hour, minute, true);//Yes 24 hour time
        mTimePicker.setTitle("Select Time");
        mTimePicker.show();

    }


        public void exitedapp(){

                AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Do you want to exit application?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

                finish();
                }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
                }).show();
    }





        }
