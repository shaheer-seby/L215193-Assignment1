package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class igAct extends AppCompatActivity {

    private ImageView profilePicture;
    private TextView screenTitle, postsCount, followersCount, followingCount;
    private Button followButton;
    private ImageView post1, post2, post3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram);

        profilePicture = findViewById(R.id.profile_picture);
        screenTitle = findViewById(R.id.screen_title);
        postsCount = findViewById(R.id.posts_count);
        followersCount = findViewById(R.id.followers_count);
        followingCount = findViewById(R.id.following_count);
        followButton = findViewById(R.id.follow_button);
        post1 = findViewById(R.id.cat2);
        post2 = findViewById(R.id.cat3);
        post3 = findViewById(R.id.cat4);


    }
}
