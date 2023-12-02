package com.example.Netflix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton; 
import android.widget.Toast; 
import android.graphics.Color; 
import java.util.Date; 
import android.graphics.drawable.ColorDrawable; 


  
public class MainActivity extends Activity {
   static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
           // getActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        
        // for play button from main activity to new activity
        ImageButton btnNext = (ImageButton) findViewById(R.id.info);
        Intent iNext;
        iNext = new Intent( MainActivity.this, Secondactivity.class);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iNext);
            }
        });
        
        
        // my list changes 
    ImageButton iv;
    int images[]={R.drawable.check,R.drawable.add};

        
        iv =(ImageButton) findViewById(R.id.add);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                if(i==0){
                    Toast.makeText(getApplicationContext(), "Added To Wishlist", Toast.LENGTH_LONG).show();
                } else if(i==1){
                    Toast.makeText(getApplicationContext(), "Removed From Wishlist", Toast.LENGTH_LONG).show();
                }
                i++;
                if(i==2)
                    i=0;
            }
        });
        
    }
}