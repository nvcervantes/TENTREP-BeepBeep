package apc.edu.ph.beepbeepbeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Reloading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reloading);
    }

    public void creditcard(View v) {
        startActivity(new Intent(Reloading.this, CardPayment.class));
    }

    public void load(View v) {
        startActivity(new Intent(Reloading.this, LoadPayment.class));
    }


}

