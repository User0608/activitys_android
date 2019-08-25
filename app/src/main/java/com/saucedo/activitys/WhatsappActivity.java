package com.saucedo.activitys;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class WhatsappActivity extends Activity {
    private TextView descripacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        this.initialize();
    }
    private void initialize(){
        descripacion = findViewById(R.id.txvdescripcion_whatsapp);
        descripacion.setText("More than 1 billion people in over 180 countries use WhatsApp1 to " +
                "stay in touch with friends and family, anytime and anywhere. WhatsApp is free2 " +
                "and offers simple, secure, reliable messaging and calling, available on phones " +
                "all over the world.\n\n" +
                "WhatsApp started as an alternative to SMS. Our product now supports sending and " +
                "receiving a variety of media: text, photos, videos, documents, and location, as " +
                "well as voice calls. Our messages and calls are secured with end-to-end encryption," +
                " meaning that no third party including WhatsApp can read or listen to them. Behind " +
                "every product decision is our desire to let people communicate anywhere in the world" +
                " without barriers.\n\n" +
                "WhatsApp was founded by Jan Koum and Brian Acton who had previously spent 20 years" +
                " combined at Yahoo. WhatsApp joined Facebook in 2014, but continues to operate as " +
                "a separate app with a laser focus on building a messaging service that works fast" +
                " and reliably anywhere in the world.\n\n");
    }

}
