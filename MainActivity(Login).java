package com.example.user.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.view.View;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean OnCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public void OnButtonClick(View v){
        if(v.getId() == R.id.Blogin)
        {
            EditText a = (EditText) findViewById(R.id.TFusername);
            String str = a.getText().toString();

            Intent i = new Intent(MainActivity.this, Display_class());
            i.putExtra("Username",str);
            startActivity(i);
        }
    }
    @Override
    public boolean onOptionItemSelected(MenuItem item){
        int id =item.getItemId();
        if (id == R.id.action_setting){
            return true;


        }

        return super.onContextItemSelected(item);

    }

}
