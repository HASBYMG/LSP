package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.example.android.R;

public class table extends AppCompatActivity {

    private boolean tabelku = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ciutkanTabel(View view){

        TableLayout table = findViewById(R.id.tabel);
        Button Button = findViewById(R.id.Button);

        table.setColumnCollapsed(1, tabelku);
        table.setColumnCollapsed(2, tabelku);

        if (tabelku){
            tabelku = false;
            Button.setText("Tunjukkan detail");
        }else {
            tabelku = true;
            Button.setText("Detail tersembunyi");
        }
    }
}