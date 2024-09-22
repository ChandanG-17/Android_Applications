package com.example.app_project;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;


public class HotelActivity extends AppCompatActivity {
    String item ="";
    int order = 0;
    CheckBox c1,c2,c3,c4;
    Button btn1;
    TextView bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        btn1=findViewById(R.id.order);
        c1= findViewById(R.id.cb1);
        c2= findViewById(R.id.cb2);
        c3= findViewById(R.id.cb3);
        c4= findViewById(R.id.cb4);
        bill=findViewById(R.id.bill);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    item = "Chapathi and fullmeals  =  150₹"+"\n";
                    order+= 150;
                }
                if(c2.isChecked()){
                    item += "Chitranna  =  50₹"+"\n";
                    order+= 50;

                }
                if(c3.isChecked()){
                    item += "Idly vade  =  60₹ "+"\n";
                    order += 60;
                }
                if(c4.isChecked()){
                    item += "Firedrice  =  70₹" + "\n";
                    order += 70;
                }

                bill.setText("Total bill: \n"+item+"\n"+"Amount: "+order);
            }
        });
    }
}