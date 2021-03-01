package com.example.hanginlhkarakterisin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton soru1e;
    RadioButton soru1h;

    RadioButton soru2e;
    RadioButton soru2h;

    RadioButton soru3e;
    RadioButton soru3h;

    RadioButton soru4e;
    RadioButton soru4h;

    RadioButton soru5e;
    RadioButton soru5h;

    RadioButton soru6e;
    RadioButton soru6h;

    RadioButton soru7e;
    RadioButton soru7h;

    RadioButton soru8e;
    RadioButton soru8h;

    RadioButton soru9e;
    RadioButton soru9h;

    RadioButton soru10e;
    RadioButton soru10h;

    Button gosterbutonu;
    int sayac = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        islevVer();




    }

    public void tanimla()
    {
        soru1e = findViewById(R.id.soru1evet);
        soru1h = findViewById(R.id.soru1hayir);
        soru2e = findViewById(R.id.soru2evet);
        soru2h = findViewById(R.id.soru2hayir);
        soru3e = findViewById(R.id.soru3evet);
        soru3h = findViewById(R.id.soru3hayir);
        soru4e = findViewById(R.id.soru4evet);
        soru4h = findViewById(R.id.soru4hayir);
        soru5e = findViewById(R.id.soru5evet);
        soru5h = findViewById(R.id.soru5hayir);
        soru6e = findViewById(R.id.soru6evet);
        soru6h = findViewById(R.id.soru6hayir);
        soru7e = findViewById(R.id.soru7evet);
        soru7h = findViewById(R.id.soru7hayir);
        soru8e = findViewById(R.id.soru8evet);
        soru8h = findViewById(R.id.soru8hayir);
        soru9e = findViewById(R.id.soru9evet);
        soru9h = findViewById(R.id.soru9hayir);
        soru10e = findViewById(R.id.soru10evet);
        soru10h = findViewById(R.id.soru10hayir);
        gosterbutonu = findViewById(R.id.butonson1);

    }

    public void islevVer()
    {
        soru1e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru1e.isEnabled() == true && soru1h.isEnabled() == true)
                {
                    sayac = sayac + 1;
                    soru1e.setEnabled(false);
                }

                else if (soru1e.isEnabled() == true && soru1h.isEnabled() == false)
                {
                    sayac = sayac + 1;
                    soru1e.setEnabled(false);
                    soru1h.setEnabled(true);
                }


            }
        });

        soru1h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru1e.isEnabled() == true && soru1h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru1h.setEnabled(false);
                }

                if (soru1e.isEnabled() == false && soru1h.isEnabled() == true)
                {
                    sayac = sayac - 1;
                    soru1h.setEnabled(false);
                    soru1e.setEnabled(true);
                }



            }
        });

        ///////////

        soru2e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru2e.isEnabled() == true && soru2h.isEnabled() == true)
                {
                    sayac = sayac + 2;
                    soru2e.setEnabled(false);
                }

                else if (soru2e.isEnabled() == true && soru2h.isEnabled() == false)
                {
                    sayac = sayac + 2;
                    soru2e.setEnabled(false);
                    soru2h.setEnabled(true);
                }


            }
        });

        soru2h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru2e.isEnabled() == true && soru2h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru2h.setEnabled(false);
                }

                if (soru2e.isEnabled() == false && soru2h.isEnabled() == true)
                {
                    sayac = sayac - 2;
                    soru2h.setEnabled(false);
                    soru2e.setEnabled(true);
                }



            }
        });

        /////////////////

        soru3e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru3e.isEnabled() == true && soru3h.isEnabled() == true)
                {
                    sayac = sayac + 3;
                    soru3e.setEnabled(false);
                }

                else if (soru3e.isEnabled() == true && soru3h.isEnabled() == false)
                {
                    sayac = sayac + 3;
                    soru3e.setEnabled(false);
                    soru3h.setEnabled(true);
                }


            }
        });

        soru3h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru3e.isEnabled() == true && soru3h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru3h.setEnabled(false);
                }

                if (soru3e.isEnabled() == false && soru3h.isEnabled() == true)
                {
                    sayac = sayac - 3;
                    soru3h.setEnabled(false);
                    soru3e.setEnabled(true);
                }



            }
        });

        ////////////

        soru4e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru4e.isEnabled() == true && soru4h.isEnabled() == true)
                {
                    sayac = sayac + 4;
                    soru4e.setEnabled(false);
                }

                else if (soru4e.isEnabled() == true && soru4h.isEnabled() == false)
                {
                    sayac = sayac + 4;
                    soru4e.setEnabled(false);
                    soru4h.setEnabled(true);
                }


            }
        });

        soru4h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru4e.isEnabled() == true && soru4h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru4h.setEnabled(false);
                }

                if (soru4e.isEnabled() == false && soru4h.isEnabled() == true)
                {
                    sayac = sayac - 4;
                    soru4h.setEnabled(false);
                    soru4e.setEnabled(true);
                }



            }
        });

        //////////////


        soru5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru5e.isEnabled() == true && soru5h.isEnabled() == true)
                {
                    sayac = sayac + 5;
                    soru5e.setEnabled(false);
                }

                else if (soru5e.isEnabled() == true && soru5h.isEnabled() == false)
                {
                    sayac = sayac + 5;
                    soru5e.setEnabled(false);
                    soru5h.setEnabled(true);
                }


            }
        });

        soru5h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru5e.isEnabled() == true && soru5h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru5h.setEnabled(false);
                }

                if (soru5e.isEnabled() == false && soru5h.isEnabled() == true)
                {
                    sayac = sayac - 5;
                    soru5h.setEnabled(false);
                    soru5e.setEnabled(true);
                }



            }
        });


        ////////////////////

        soru6e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru6e.isEnabled() == true && soru6h.isEnabled() == true)
                {
                    sayac = sayac + 6;
                    soru6e.setEnabled(false);
                }

                else if (soru6e.isEnabled() == true && soru6h.isEnabled() == false)
                {
                    sayac = sayac + 6;
                    soru6e.setEnabled(false);
                    soru6h.setEnabled(true);
                }


            }
        });

        soru6h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru6e.isEnabled() == true && soru6h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru6h.setEnabled(false);
                }

                if (soru6e.isEnabled() == false && soru6h.isEnabled() == true)
                {
                    sayac = sayac - 6;
                    soru6h.setEnabled(false);
                    soru6e.setEnabled(true);
                }



            }
        });

        ///////////////

        soru7e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru7e.isEnabled() == true && soru7h.isEnabled() == true)
                {
                    sayac = sayac + 7;
                    soru7e.setEnabled(false);
                }

                else if (soru7e.isEnabled() == true && soru7h.isEnabled() == false)
                {
                    sayac = sayac + 7;
                    soru7e.setEnabled(false);
                    soru7h.setEnabled(true);
                }


            }
        });

        soru7h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru7e.isEnabled() == true && soru7h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru7h.setEnabled(false);
                }

                if (soru7e.isEnabled() == false && soru7h.isEnabled() == true)
                {
                    sayac = sayac - 7;
                    soru7h.setEnabled(false);
                    soru7e.setEnabled(true);
                }



            }
        });

        soru8e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru8e.isEnabled() == true && soru8h.isEnabled() == true)
                {
                    sayac = sayac + 8;
                    soru8e.setEnabled(false);
                }

                else if (soru8e.isEnabled() == true && soru8h.isEnabled() == false)
                {
                    sayac = sayac + 8;
                    soru8e.setEnabled(false);
                    soru8h.setEnabled(true);
                }


            }
        });

        soru8h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru8e.isEnabled() == true && soru8h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru8h.setEnabled(false);
                }

                if (soru8e.isEnabled() == false && soru8h.isEnabled() == true)
                {
                    sayac = sayac - 8;
                    soru8h.setEnabled(false);
                    soru8e.setEnabled(true);
                }



            }
        });
        //////////////////////////////

        soru9e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru9e.isEnabled() == true && soru9h.isEnabled() == true)
                {
                    sayac = sayac + 9;
                    soru9e.setEnabled(false);
                }

                else if (soru9e.isEnabled() == true && soru9h.isEnabled() == false)
                {
                    sayac = sayac + 9;
                    soru9e.setEnabled(false);
                    soru9h.setEnabled(true);
                }


            }
        });

        soru9h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru9e.isEnabled() == true && soru9h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru9h.setEnabled(false);
                }

                if (soru9e.isEnabled() == false && soru9h.isEnabled() == true)
                {
                    sayac = sayac - 9;
                    soru9h.setEnabled(false);
                    soru9e.setEnabled(true);
                }



            }
        });



        soru10e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soru10e.isEnabled() == true && soru10h.isEnabled() == true)
                {
                    sayac = sayac + 10;
                    soru10e.setEnabled(false);
                }

                else if (soru10e.isEnabled() == true && soru10h.isEnabled() == false)
                {
                    sayac = sayac + 10;
                    soru10e.setEnabled(false);
                    soru10h.setEnabled(true);
                }


            }
        });

        soru10h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soru10e.isEnabled() == true && soru10h.isEnabled()== true)
                {
                    sayac = sayac + 0;
                    soru10h.setEnabled(false);
                }

                if (soru10e.isEnabled() == false && soru10h.isEnabled() == true)
                {
                    sayac = sayac - 10;
                    soru10h.setEnabled(false);
                    soru10e.setEnabled(true);
                }



            }
        });

        gosterbutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(sayac);

                Intent yenisayfa = new Intent(MainActivity.this,MainActivity2.class);
                yenisayfa.putExtra("sonuc",sayac);
                startActivity(yenisayfa);

            }
        });


    }








}