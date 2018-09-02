package apc.edu.ph.beepbeepbeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        Button button = (Button)findViewById(R.id.verifysub);

        // Show toast message when button is clicked

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Your beep card has been reloaded!", Toast.LENGTH_LONG).show();// Set your own toast  message

            }

        });
    }
}
