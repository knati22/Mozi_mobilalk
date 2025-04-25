package com.example.mozi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class regActivity extends AppCompatActivity {
    private static final String REG = regActivity.class.getName();
    private static final int SECRET = 68;
    EditText vnevv;
    EditText knevv;
    EditText nevvv;
    EditText emailv;
    EditText jelv;
    EditText jelmv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reg);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

       // Bundle bundle = getIntent().getExtras();
       // bundle.getInt("SECRET");

        int secret = getIntent().getIntExtra("SECRET",0);

        if (secret != 68){
            finish();
        }

        vnevv=findViewById(R.id.vnev);
        knevv=findViewById(R.id.knev);
        nevvv=findViewById(R.id.nevv);
        emailv=findViewById(R.id.email);
        jelv=findViewById(R.id.jel);
        jelmv=findViewById(R.id.jelm);
    }


    public void reg(View view) {

        String kereszt = knevv.getText().toString();
        String vezetek = vnevv.getText().toString();
        String felhasznalonev = nevvv.getText().toString();
        String emil = emailv.getText().toString();
        String jelszo = jelv.getText().toString();
        String jelszomeg = jelmv.getText().toString();

        if (!jelszo.equals(jelszomeg)){
            Log.e(REG, "A két jelszó nem egyezik");
        }
        fooldalugras();
    }

    public void meg(View view) {
        finish();
    }

    private void fooldalugras(){
        Intent intent = new Intent(this, fooldalActivity.class);
        intent.putExtra("SECRET",SECRET);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}