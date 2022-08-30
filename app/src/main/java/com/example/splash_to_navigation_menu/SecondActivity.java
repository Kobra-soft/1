package com.example.splash_to_navigation_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView, mainImageView2;
    TextView title, description, number, info;

    String data1, data2, data3, data4;
    int myImage, myImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        mainImageView2 = findViewById(R.id.mainImageView2);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        number = findViewById(R.id.number);
        info = findViewById(R.id.info);

        getData();
        setData();

    }

    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("myImage2") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2") && getIntent().hasExtra("data3") && getIntent().hasExtra("data4")) {

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            data4 = getIntent().getStringExtra("data4");
            myImage = getIntent().getIntExtra("myImage", 1);
            myImage2 = getIntent().getIntExtra("myImage2", 1);

        } else {
            Toast.makeText(this, "no Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        title.setText(data1);
        description.setText(data2);
        number.setText(data3);
        info.setText(data4);
        mainImageView.setImageResource(myImage);
        mainImageView2.setImageResource(myImage2);
    }
}