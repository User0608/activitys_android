package com.saucedo.activitys;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;

public class SaludoActivity extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        findViewById(R.id.txvexit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
