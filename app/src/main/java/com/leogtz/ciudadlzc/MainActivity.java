package com.leogtz.ciudadlzc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemMalecon:
                Intent i1 = new Intent(this,MapMaleconActivity.class);
                startActivity(i1);
                break;
            case R.id.itemPalacio:
                Intent i2 = new Intent(this,MapPalacioActivity.class);
                startActivity(i2);
                break;
            case R.id.itemPlaya:
                Intent i3 = new Intent(this,MapPlayaActivity.class);
                startActivity(i3);
                break;
            case R.id.itemPlaza:
                Intent i4 = new Intent(this,MapPlazaActivity.class);
                startActivity(i4);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void goMapPlaza(View v){
        Intent i = new Intent(this,MapPlazaActivity.class);
        startActivity(i);
    }
    public void goMapPlaya(View v){
        Intent i = new Intent(this,MapPlayaActivity.class);
        startActivity(i);
    }
    public void goMapMalecon(View v){
        Intent i = new Intent(this,MapMaleconActivity.class);
        startActivity(i);
    }
    public void goMapPalacio(View v){
        Intent i = new Intent(this,MapPalacioActivity.class);
        startActivity(i);
    }
}
