package apc.edu.ph.beepbeepbeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void transactions(View v) {
        startActivity(new Intent(MainActivity.this, PuvListActivity.class));
    }
    public void stations(View v) {
        startActivity(new Intent(MainActivity.this, PuvListActivity.class));
    }
    public void reload(View v) {
        startActivity(new Intent(MainActivity.this, PuvListActivity.class));
    }
}

