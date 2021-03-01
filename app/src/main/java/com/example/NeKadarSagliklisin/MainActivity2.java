package com.example.NeKadarSagliklisin;

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

        if(sonuc2 >=16 && sonuc2 <= 23)
        {
            imgdegis.setImageResource(R.drawable.saglikli);
            sonuckim.setText("Tebrikler... Böyle devam et");
        }
        else if (sonuc2 >23 && sonuc2 <=30)
        {
            imgdegis.setImageResource(R.drawable.ortasaglikli);
            sonuckim.setText("Ha gayret... Hayatını daha sağlıklı bir şekilde yaşayabilirsin");
        }
        else
        {
            imgdegis.setImageResource(R.drawable.sagliksiz);
            sonuckim.setText("Maalesef... Hayatini acilen düzene sokmalısın");
        }






    }


}