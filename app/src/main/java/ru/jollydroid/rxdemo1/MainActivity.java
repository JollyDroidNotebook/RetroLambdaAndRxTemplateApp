package ru.jollydroid.rxdemo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.MyClass;

public class MainActivity extends AppCompatActivity {

    private MyClass a;
    @Nullable private View hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.hello);
        assert hello != null;

        hello.setOnClickListener(v -> Log.d("happy", "clicked"));
    }

}
