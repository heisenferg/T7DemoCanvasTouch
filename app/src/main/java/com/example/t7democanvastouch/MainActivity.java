package com.example.t7democanvastouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Juego j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Juego(this));
    }

    @Override
    protected void onDestroy() {
        j.fin();
        Log.d(Juego.class.getSimpleName(), "destruida");
        super.onDestroy();

    }

}