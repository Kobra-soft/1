package com.example.splash_to_navigation_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.realmadrid84x84_1_f,
            R.drawable.realmadrid84x84_2_f,
            R.drawable.realmadrid84x84_3_f,
            R.drawable.realmadrid84x84_4_f,
            R.drawable.realmadrid84x84_5_f,
            R.drawable.realmadrid84x84_6_f,
            R.drawable.realmadrid84x84_7_f,
            R.drawable.realmadrid84x84_8_f,
            R.drawable.realmadrid84x84_9_f,
            R.drawable.realmadrid84x84_10_f,
            R.drawable.realmadrid84x84_11_f,
            R.drawable.realmadrid84x84_12_f,
            R.drawable.realmadrid84x84_13_f,
            R.drawable.realmadrid84x84_14_f,
            R.drawable.realmadrid84x84_15_f,
            R.drawable.realmadrid84x84_16_f,
            R.drawable.realmadrid84x84_17_f,
            R.drawable.realmadrid84x84_18_f,
            R.drawable.realmadrid84x84_19_f,
            R.drawable.realmadrid84x84_20_f,
            R.drawable.realmadrid84x84_21_f,
            R.drawable.realmadrid84x84_22_f,
            R.drawable.realmadrid84x84_23_f,
            R.drawable.realmadrid84x84_24_f,
            R.drawable.realmadrid84x84_25_f,
            R.drawable.realmadrid84x84_26_f};

    int images2[] = {R.drawable.ic_flags_fifa_belgium,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_brazil,
            R.drawable.ic_flags_fifa_austria,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_belgium,
            R.drawable.ic_flags_fifa_germany,
            R.drawable.ic_flags_fifa_france,
            R.drawable.ic_flags_fifa_croatia,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_brazil,
            R.drawable.ic_flags_fifa_ukraine,
            R.drawable.ic_flags_fifa_brazil,
            R.drawable.ic_flags_fifa_uraguay3,
            R.drawable.ic_flags_fifa_serbia,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_wales,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_brazil,
            R.drawable.ic_flags_fifa_brazil,
            R.drawable.ic_flags_fifa_spain,
            R.drawable.ic_flags_fifa_france,
            R.drawable.ic_flags_fifa_dom_republic,
            R.drawable.ic_flags_fifa_france,
            R.drawable.ic_flags_fifa_spain,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*setContentView(R.layout.fragment_team3);*/

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);
        s3 = getResources().getStringArray(R.array.player_number);
        s4 = getResources().getStringArray(R.array.player_info);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, s4, images, images2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}