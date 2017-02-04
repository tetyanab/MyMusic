package com.example.android.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SongsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);

        // Find the "Play all" button
        Button playall = (Button) findViewById(R.id.play_all);

        // Set a click listener on that button
        playall.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Discover similar" button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playallIntent = new Intent(SongsListActivity.this, NowPlayingActivity.class);
                startActivity(playallIntent);
            }
        });

        // Find the "Discover similar" button
        Button discover = (Button) findViewById(R.id.discover_similar);

        // Set a click listener on that button
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Discover similar" button is clicked on.
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(SongsListActivity.this, SimilarArtistsActivity.class);
                startActivity(discoverIntent);
            }
        });
    }
}
