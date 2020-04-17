package com.example.danghuuphuc_59131890_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView tenUD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Called");
        Toast.makeText(getApplicationContext(), "Create Called", Toast.LENGTH_SHORT).show();
        tenUD = findViewById(R.id.tenUD);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        tenUD.setText(date);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
        Toast.makeText(getApplicationContext(), "Start Called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
        Toast.makeText(getApplicationContext(), "Restart Called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume Called");
        Toast.makeText(getApplicationContext(), "Resume Called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause Called");
        Toast.makeText(getApplicationContext(), "Pause Called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Called");
        Toast.makeText(getApplicationContext(), "Stop Called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Called");
        Toast.makeText(getApplicationContext(), "Destroy Called", Toast.LENGTH_SHORT).show();
    }
}
