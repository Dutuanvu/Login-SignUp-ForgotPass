package com.example.agriculturemarketplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {



private Button btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_logout = findViewById(R.id.btn_logout);
        // Check if the user is signed in
        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            // User is not signed in, redirect to MainActivity
            Intent i = new Intent(MainActivity.this, Login.class);
            startActivity(i);
            finish(); // Finish the current activity
        }
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
                finish(); // Finish the current activity
            }
        });
    }

}