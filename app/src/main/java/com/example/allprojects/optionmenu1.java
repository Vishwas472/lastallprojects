package com.example.allprojects;

import static com.example.allprojects.R.id.save;
import static com.example.allprojects.R.layout.activity_optionmenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class optionmenu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_optionmenu1);
        initview();
    }

    private void initview() {
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemsvave:
                Toast.makeText(getApplicationContext(), "save option", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.stutus:
                Toast.makeText(getApplicationContext(), "save stutud", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(getApplicationContext(), "save setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.serch:
                Toast.makeText(getApplicationContext(), "save search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.newgroup:
                Toast.makeText(getApplicationContext(), "save newgroup", Toast.LENGTH_SHORT).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
