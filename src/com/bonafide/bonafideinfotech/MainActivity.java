package com.bonafide.bonafideinfotech;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       /* BitmapFactory.Options default = new BitmapFactory.Options();
        default.inDensity = <density of loaded resource>
        default.inTargetDensity = 
        getResources().getDisplayMetrics().densityDpi;*/

        
        TextView aboutUsText = (TextView)findViewById(R.id.about_us);
        
        aboutUsText.setOnClickListener(new View.OnClickListener() {
        	   @Override
        	   public void onClick(View v) {
        	      // TODO Auto-generated method stub
        		   Intent callIntent = new Intent(MainActivity.this, About_us.class);
        		   startActivity(callIntent);
        	   }
        	});
        
        //our services text
        TextView btnOurServices = (TextView)findViewById(R.id.services);
        
        //if our services is Clicked:
        btnOurServices.setOnClickListener(new View.OnClickListener() {
        	   @Override
        	   public void onClick(View v) {
        	      // TODO Auto-generated method stub
        		   Intent callIntent = new Intent(MainActivity.this, Our_services.class);
        		   startActivity(callIntent);
        	   }
        	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
