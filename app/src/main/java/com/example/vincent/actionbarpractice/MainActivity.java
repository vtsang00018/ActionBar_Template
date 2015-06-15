package com.example.vincent.actionbarpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();

        // Get the custom action items menu
        inflater.inflate(R.menu.action_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void nextActivity(View v){
        Intent nextIntent = new Intent(this, NextPage.class);
        startActivity(nextIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {

            // TODO: (Optional) add more action bar items
            //noinspection SimplifiableIfStatement
            case R.id.action_settings:
                // TODO: Add the implementation for the settings menu
                Toast.makeText(MainActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                return true;

            case  R.id.action_search:
                // TODO: Add the implementation for the search action
                Toast.makeText(MainActivity.this, "You clicked Search", Toast.LENGTH_SHORT).show();
                return true;
            // This handles the Up action: finishes the activity and calls the parent activity
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
