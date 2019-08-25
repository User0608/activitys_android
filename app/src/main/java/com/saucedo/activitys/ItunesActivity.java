package com.saucedo.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ItunesActivity extends AppCompatActivity {
    private TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itunes);
        this.initialize();
    }
    private void initialize(){
        descripcion=findViewById(R.id.txvdescripcion_itunes);
        descripcion.setText("iTunes is as good as dead, leaving many to wonder: When iTunes goes, " +
                "what happens to all your music? Don't worry -- Apple isn't taking away your tunes. " +
                "But it is carving up iTunes' duties into four parts, giving Apple Music the bulk of" +
                " the work. It'll be a shock for loyal iTunes users who, for 18 years, learned to rely" +
                " on the app for everything from syncing their iPhones to building playlists and buying " +
                "songs. However, Apple is confident in your ability to teach yourself new tricks, as it " +
                "channels you to Apple Music, Apple Podcasts, Apple TV and the Finder instead. \n\n" +
                "Apple's shifting strategy may be jarring for longtime users, but music fits squarely into" +
                " the tech giant's portfolio of premium experiences that keep loyal users invested in the" +
                " brand's ecosystem. For a company initially focused on hardware, iTunes was one of Apple's " +
                "first major successes in this area. People who had bought music from Apple were less likely to" +
                " stray. Now, Apple is betting that Apple Music help juice Apple's further push into software " +
                "and services.\n\n" +
                "Nevertheless, closing down iTunes raises big questions for those who have built up musical " +
                "collections over the years. What do you have to do, if anything, to keep your investment intact? " +
                "What if you use iTunes for Windows? What happens to iTunes Match? And why is Apple axing iTunes to " +
                "begin with?\n\n" +
                "Here's what we know about Apple's plans to transition you to Apple Music and the rest.");
    }
}
