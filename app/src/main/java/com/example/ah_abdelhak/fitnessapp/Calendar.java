package com.example.ah_abdelhak.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ah_abdelhak.fitnessapp.Custom.WorkoutDoneDecorator;
import com.example.ah_abdelhak.fitnessapp.Database.YogaDB;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Calendar extends AppCompatActivity {

    MaterialCalendarView materialCalendarView;
    HashSet<CalendarDay> list = new HashSet<>();
    YogaDB yogaDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        yogaDB = new YogaDB(this);
        materialCalendarView = (MaterialCalendarView)findViewById(R.id.calendar);
        List<String> workoutDay = yogaDB.getWorkDays();
        HashSet<CalendarDay> convertedList = new HashSet<>();
        for (String value:workoutDay) {
            convertedList.add(CalendarDay.from(new Date(Long.parseLong(value))));
            materialCalendarView.addDecorator(new WorkoutDoneDecorator(convertedList));

        }
    }
}