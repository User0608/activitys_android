package com.saucedo.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RedditActivity extends AppCompatActivity {
    private TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);
        this.initializar();
    }
    private void initializar(){
        descripcion=findViewById(R.id.txvdescripcion_reddit);
        descripcion.setText("If you spend a lot of time online, chances are you’ve heard of Reddit. " +
                "The site bills itself as the “front page of the internet,” and that’s not an empty boast: " +
                "As of this writing, Reddit is the sixth-most-popular site in the United States, according to " +
                "Alexa, and the 18th worldwide. So what exactly is Reddit? Essentially, it’s a massive collection" +
                " of forums, where people can share news and content or comment on other people’s posts. Here’s" +
                " everything you need to know.\n" );
    }
}
