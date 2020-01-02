package com.example.alertview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonCustomAlert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCustomAlert = findViewById(R.id.buttonCustomAlert);

        final AlertDialogBuilder alertDialogBuilder = new AlertDialogBuilder();

        buttonCustomAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = getLayoutInflater().inflate(R.layout.alert_design, null);

                Button buttonYes = view.findViewById(R.id.buttonYes);
                Button buttonNo = view.findViewById(R.id.buttonNo);

                alertDialogBuilder.method(MainActivity.this, view);

                buttonYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Yes Click", Toast.LENGTH_SHORT).show();
                        alertDialogBuilder.getDialog().dismiss();

                    }
                });

                buttonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "No Click", Toast.LENGTH_SHORT).show();
                        alertDialogBuilder.getDialog().dismiss();
                    }
                });

                alertDialogBuilder.getDialog().show();

            }
        });
    }
}
