package com.example.hanginlhkarakterisin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgdegis;
    TextView sonucyazisi;
    TextView sonuckim;
    int sonuc2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        sonucyazisi = findViewById(R.id.sayfa2yazi);
        sonuckim = findViewById(R.id.sonuckim);

        imgdegis = findViewById(R.id.main2img);

        sonuc2 = intent.getIntExtra("sonuc",0);
        System.out.println(sonuc2);
        String yazi = String.valueOf(sonuc2);
        sonucyazisi.setText(yazi);

        islevVer2(sonuc2);

        





    }

    public  void islevVer2(int sonuc2)
    {
        if (sonuc2 == 23)
        {
            imgdegis.setImageResource(R.drawable.ahmert);
            sonuckim.setText("Sen Ahmertsin !!!");

        }
        else if (sonuc2 == 33)
        {
            imgdegis.setImageResource(R.drawable.taner);
            sonuckim.setText("i got you Taner !!!");
        }
        else if(sonuc2 == 24)
        {
            imgdegis.setImageResource(R.drawable.turhan);
            sonuckim.setText("Bu sensin Turhan adam !!!");
        }
        else if (sonuc2 == 16)
        {
            imgdegis.setImageResource(R.drawable.fatih);
            sonuckim.setText("Tft şans oyunudur Fatih adam !!!");
        }
        else if (sonuc2 == 26)
        {
            imgdegis.setImageResource(R.drawable.must);
            sonuckim.setText("Must esnek gel !!!");
        }
        else if (sonuc2 == 11)
        {
            imgdegis.setImageResource(R.drawable.turgut);
            sonuckim.setText("Topta oynama lan alıngan götveren !!!");
        }
        else if (sonuc2 == 4)
        {
            imgdegis.setImageResource(R.drawable.umit);
            sonuckim.setText("İşte sensin Ümit adam !!!");
        }
        else if (sonuc2 == 18)
        {
            imgdegis.setImageResource(R.drawable.goksel);
            sonuckim.setText("Bu sensin Göksel adam !!!");
        }
        else if (sonuc2 == 11)
        {
            imgdegis.setImageResource(R.drawable.selcuk);
            sonuckim.setText("Noldu lan Selcuk he !!!");
        }
        else if (sonuc2 == 9)
        {
            imgdegis.setImageResource(R.drawable.sefa);
            sonuckim.setText("Hosgeldin Sefa adam !!!");
        }
        else if (sonuc2 == 21)
        {
            imgdegis.setImageResource(R.drawable.kerem);
            sonuckim.setText("Kerem adam bu sensin !!!");
        }
        else
        {
            imgdegis.setImageResource(R.drawable.senkimsin);
            sonuckim.setText("BRUHHHH sen kimsin ????");
        }






    }


}