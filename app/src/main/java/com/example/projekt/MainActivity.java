package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button buttonReset, buttonZapisz;
    private ImageButton imageButton;
    private ListView listaWynikow;
    private ArrayList<String> wyniki = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonReset = findViewById(R.id.buttonRestart);
        buttonZapisz = findViewById(R.id.buttonZapiszList);
        imageButton = findViewById(R.id.imageButton);
        listaWynikow = findViewById(R.id.listView);
        buttonZapisz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //zapis wyniku do listy
                    }
                }
        );
        buttonReset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //reset wyniku
                    }
                }
        );
        imageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //zmienia pozycje po kazdym kliknieciu
                    }
                }
        );
        //todo przycisk zmeinia pozycje po kazdym kliknieciu, liczenie punktow na kazdym kliknieciu, czas - 10 sekund, zapisz wynik do listy,
    }
}