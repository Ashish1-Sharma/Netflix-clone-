package com.example.Netflix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Handler;
public class splash extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        
         setContentView(R.layout.splash_screen);
        
        
        Intent iHome = new Intent(splash.this,MainActivity.class);
        
        new Handler().postDelayed(new Runnable() {
        @Override
        
        public void run() {
            startActivity(iHome);
            finish();
        }
        }, 2000);
        
    }
}
