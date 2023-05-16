package sg.edu.rp.c346.id22023910.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    //declare field variables
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link the field variables to UI components in layout
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.resetButton);
        tvDisplay = findViewById(R.id.textViewDisplay);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();

                tvDisplay.setText("Time is " + String.format("%02d:%02d", hour, minute));

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int date = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();

                tvDisplay.setText("Date is " + String.format("%02d/%02d/%02d", date, month + 1, year));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020, 1, 1);

            }
        });


    }
}