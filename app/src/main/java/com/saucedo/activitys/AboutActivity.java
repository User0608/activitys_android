package com.saucedo.activitys;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends  Activity {

    private TextView descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.initializar();
    }
    private void initializar(){
        descripcion=findViewById(R.id.txvdescripcion_about);
        descripcion.setText("I'm a  developer and I like to learn new things everyday." +
                "I'm the type of person who writes code for hours...");
    }
}
