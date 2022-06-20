package com.example.implicitview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnOpenWeb = null;
    EditText urlInput = null;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        setContentView(R.layout.main_activity);
        urlInput = findViewById(R.id.urlInput);
        btnOpenWeb = findViewById(R.id.webOpen);
        btnOpenWeb = setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent implicitIntent = new Intent((Intent.ACTION_VIEW, urlInput);
           if (implicitIntent.resolveActivity(getPackageManager()) != null)
                {
              startActivity(implicitIntent);
             }
            }
        });
    }
}
