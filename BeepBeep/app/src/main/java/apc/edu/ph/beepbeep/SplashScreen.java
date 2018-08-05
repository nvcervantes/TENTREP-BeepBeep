package apc.edu.ph.beepbeep;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Creates an Intent to start MainActivity
                Intent intent = new Intent(SplashScreen.this, Login.class);
                SplashScreen.this.startActivity(intent);

                // This will destroy SplashScreenActivity
                SplashScreen.this.finish();
            }
        }, 2500);

    }
}
