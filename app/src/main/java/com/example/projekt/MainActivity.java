package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button buttonReset, buttonZapisz, buttonStart;
    private ImageButton imageButton;
    private ListView listaWynikow;
    private ArrayList<String> wyniki = new ArrayList<>();
    private TextView textViewPunkty, textViewCzas, textViewTest;
    private int sekundy = 10;
    private int punkty = 0;
    private LinearLayout linear;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonReset = findViewById(R.id.buttonRestart);
        buttonZapisz = findViewById(R.id.buttonZapiszList);
        buttonStart = findViewById(R.id.buttonStart);
        imageButton = findViewById(R.id.imageButton);
        listaWynikow = findViewById(R.id.listView);
        textViewCzas = findViewById(R.id.textViewCzas);
        textViewPunkty = findViewById(R.id.textViewPunkty);
        textViewTest = findViewById(R.id.textViewTest);
        linear = findViewById(R.id.linear);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                wyniki
        );
        listaWynikow.setAdapter(adapter);
        wyniki.add("Punkty : 10");
        wyniki.add("Punkty : 12");
<<<<<<< HEAD
        wyniki.add("Punkty : 20");
        //dodac date utworzenia punktow^
=======
>>>>>>> 6dcb810f01d0a002bf784245a40ecf3a855d7acc
        buttonStart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
<<<<<<< HEAD
                        imageButton.setVisibility(View.VISIBLE);
                        timer = new CountDownTimer(sekundy * 1000, 1000) {
=======
                        timer = new CountDownTimer(sekundy*1000,1000) {
>>>>>>> 6dcb810f01d0a002bf784245a40ecf3a855d7acc
                            @Override
                            public void onTick(long l) {
                                sekundy = (int) l / 1000;
                                textViewCzas.setText("0 : " + String.valueOf(sekundy));
                            }

                            @Override
                            public void onFinish() {
                                textViewCzas.setText("Koniec czasu.");
                                buttonZapisz.setVisibility(View.VISIBLE);
                                //punkty sie nie dodaja, if visibile czy clickable?
                            }
                        };
                        timer.start();
                    }
                }
        );
        buttonZapisz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //zapis wyniku do listy, tylko po ukonczonym czasie
                        String wynik = textViewPunkty.getText().toString();
                        wyniki.add(wynik);
                        adapter.notifyDataSetChanged();
                        //jesli punkty = 0 -> nie zapisuj, if zapisz once -> no more!
                    }
                }
        );
        listaWynikow.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                        wyniki.remove(i);
                        adapter.notifyDataSetChanged();
                    }
                }
        );
        buttonReset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //reset wyniku, i czasu 120, 120
                        timer.start();
                        textViewPunkty.setText("Punkty : 0");
                        punkty = 0;
                        buttonZapisz.setVisibility(View.INVISIBLE);
                        buttonReset.setVisibility(View.VISIBLE);
                    }
                }
        );
        imageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //zmienia pozycje po kazdym kliknieciu, losowanie 250-max, 10-min
                        int losTop = (int) (Math.random() * 250) + 10;
                        int losLeft = (int) (Math.random() * 250) + 10;
<<<<<<< HEAD
                        textViewTest.setText("Top: " + losTop + ", Left: " + losLeft);
                        //LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linear.findViewById(R.id.linear).getLayoutParams();
                        //layoutParams.setMargins(losLeft, losTop, 0, 0);
                        punkty++;
                        textViewPunkty.setText("Punkty : " + punkty);
=======
                        punkty++;
                        textViewPunkty.setText("Punkty : " + punkty);
                        }
>>>>>>> 6dcb810f01d0a002bf784245a40ecf3a855d7acc
                    }
                );
    }
}