package com.example.android.mymusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows a card for Artist 1
        LinearLayout artist1 = (LinearLayout) findViewById(R.id.artist1);

        // Set a click listener on that layout
        artist1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the layout for artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist1Intent = new Intent(MainActivity.this, SongsListActivity.class);
                startActivity(artist1Intent);
            }
        });

        // Find the View that shows a card for Artist 2
        LinearLayout artist2 = (LinearLayout) findViewById(R.id.artist2);

        // Set a click listener on that layout
        artist2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the layout for artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist2Intent = new Intent(MainActivity.this, SongsListActivity.class);
                startActivity(artist2Intent);
            }
        });

        // Find the View that shows a card for Artist 3
        LinearLayout artist3 = (LinearLayout) findViewById(R.id.artist3);

        // Set a click listener on that layout
        artist3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the layout for artist 3 is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist3Intent = new Intent(MainActivity.this, SongsListActivity.class);
                startActivity(artist3Intent);
            }
        });

        // Find the View that shows a card for Artist 4
        LinearLayout artist4 = (LinearLayout) findViewById(R.id.artist4);

        // Set a click listener on that layout
        artist4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the layout for artist 4 is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist4Intent = new Intent(MainActivity.this, SongsListActivity.class);
                startActivity(artist4Intent);
            }
        });
    }
}
