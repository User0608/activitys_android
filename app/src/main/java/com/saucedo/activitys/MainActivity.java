package com.saucedo.activitys;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initialize_buttons();
    }
    private void initialize_buttons(){
       findViewById(R.id.ibtnreddit).setOnClickListener(clickListener);
       findViewById(R.id.ibtnitunes).setOnClickListener(clickListener);
       findViewById(R.id.ibtnwhatsapp).setOnClickListener(clickListener);

       findViewById(R.id.txvabout).setOnClickListener(clickListener);
       findViewById(R.id.txvautor).setOnClickListener(clickListener);
    }

   View.OnClickListener clickListener = new View.OnClickListener() {//Creasion del objeto OnClickListener.
       @Override
       public void onClick(View view) {
           Intent intent=null;
           switch (view.getId()){
               case R.id.ibtnreddit:
                   intent=new Intent(MainActivity.this,RedditActivity.class);
                   break;
               case R.id.ibtnitunes:
                   intent=new Intent(MainActivity.this,ItunesActivity.class);
                   break;

               case R.id.ibtnwhatsapp:
                   intent=new Intent(MainActivity.this,WhatsappActivity.class);
                   break;

               case R.id.txvabout:
                   intent=new Intent(MainActivity.this, AboutActivity.class);
                   break;

               case R.id.txvautor:
                   intent=new Intent(MainActivity.this, SaludoActivity.class);
                   break;
           }
           if(intent!=null){
               startActivity(intent);
           }
       }
   };

}
