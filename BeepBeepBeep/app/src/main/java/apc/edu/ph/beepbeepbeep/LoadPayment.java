package apc.edu.ph.beepbeepbeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoadPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_payment);
    }

    public void loadsubmit(View v) {
        startActivity(new Intent(LoadPayment.this, Verification.class));
    }

}
