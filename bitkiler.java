package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class bitkiler extends AppCompatActivity {
    Button btn39,btn40,btn41,btn42,btn43,btn44,btn45,btn46,btn47,
        btn48,btn49,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitkiler);

        final MediaPlayer sss1=MediaPlayer.create(this,R.raw.gul);final MediaPlayer sss2=MediaPlayer.create(this,R.raw.lale);
        final MediaPlayer sss3=MediaPlayer.create(this,R.raw.orkide);final MediaPlayer sss4=MediaPlayer.create(this,R.raw.ortanca);
        final MediaPlayer sss5=MediaPlayer.create(this,R.raw.sutlegen);final MediaPlayer sss6=MediaPlayer.create(this,R.raw.papatya);
        final MediaPlayer sss7=MediaPlayer.create(this,R.raw.reyhan);final MediaPlayer sss8=MediaPlayer.create(this,R.raw.acelya);
        final MediaPlayer sss9=MediaPlayer.create(this,R.raw.akasya);final MediaPlayer sss10=MediaPlayer.create(this,R.raw.cam);
        final MediaPlayer sss11=MediaPlayer.create(this,R.raw.cay);final MediaPlayer sss12=MediaPlayer.create(this,R.raw.cilek);
        final MediaPlayer sss13=MediaPlayer.create(this,R.raw.ceviz);final MediaPlayer sss14=MediaPlayer.create(this,R.raw.defne);
        final MediaPlayer sss15=MediaPlayer.create(this,R.raw.elma);final MediaPlayer sss16=MediaPlayer.create(this,R.raw.menekse);
        final MediaPlayer sss17=MediaPlayer.create(this,R.raw.visne);final MediaPlayer sss18=MediaPlayer.create(this,R.raw.zakkum);
        final MediaPlayer sss19=MediaPlayer.create(this,R.raw.zambak);
        btn39=(Button)findViewById(R.id.btn39);btn40=(Button)findViewById(R.id.btn40);btn41=(Button)findViewById(R.id.btn41);
        btn42=(Button)findViewById(R.id.btn42);btn43=(Button)findViewById(R.id.btn43);btn44=(Button)findViewById(R.id.btn44);
        btn45=(Button)findViewById(R.id.btn45);btn46=(Button)findViewById(R.id.btn46);btn47=(Button)findViewById(R.id.btn47);
        btn48=(Button)findViewById(R.id.btn48);btn49=(Button)findViewById(R.id.btn49);btn50=(Button)findViewById(R.id.btn50);
        btn51=(Button)findViewById(R.id.btn51);btn52=(Button)findViewById(R.id.btn52);btn53=(Button)findViewById(R.id.btn53);
        btn54=(Button)findViewById(R.id.btn54);btn55=(Button)findViewById(R.id.btn55);btn56=(Button)findViewById(R.id.btn56);
        btn57=(Button)findViewById(R.id.btn57);

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss1.start();
            }
        });
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss2.start();
            }
        });
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss3.start();
            }
        });
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss4.start();
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss5.start();
            }
        });
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss6.start();
            }
        });
        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss7.start();
            }
        });
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss8.start();
            }
        });
        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss9.start();
            }
        });
        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss10.start();
            }
        });
        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss11.start();
            }
        });
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss12.start();
            }
        });
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss13.start();
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss14.start();
            }
        });

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss15.start();
            }
        });
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss16.start();
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss17.start();
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss18.start();
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss19.start();
            }
        });



    }
}