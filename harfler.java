package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class harfler extends AppCompatActivity {
    Button btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,
            btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler);

        final MediaPlayer ss1= MediaPlayer.create(this,R.raw.a);final MediaPlayer ss2= MediaPlayer.create(this,R.raw.b);
        final MediaPlayer ss3= MediaPlayer.create(this,R.raw.c);final MediaPlayer ss4= MediaPlayer.create(this,R.raw.ce);
        final MediaPlayer ss5= MediaPlayer.create(this,R.raw.d);final MediaPlayer ss6= MediaPlayer.create(this,R.raw.e);
        final MediaPlayer ss7= MediaPlayer.create(this,R.raw.f);final MediaPlayer ss8= MediaPlayer.create(this,R.raw.g);
        final MediaPlayer ss9= MediaPlayer.create(this,R.raw.ge);final MediaPlayer ss10= MediaPlayer.create(this,R.raw.h);
        final MediaPlayer ss11= MediaPlayer.create(this,R.raw.i);final MediaPlayer ss12= MediaPlayer.create(this,R.raw.ii);
        final MediaPlayer ss13= MediaPlayer.create(this,R.raw.j);final MediaPlayer ss14= MediaPlayer.create(this,R.raw.ke);
        final MediaPlayer ss15= MediaPlayer.create(this,R.raw.l);final MediaPlayer ss16= MediaPlayer.create(this,R.raw.m);
        final MediaPlayer ss17= MediaPlayer.create(this,R.raw.n);final MediaPlayer ss18= MediaPlayer.create(this,R.raw.o);
        final MediaPlayer ss19= MediaPlayer.create(this,R.raw.oo);final MediaPlayer ss20= MediaPlayer.create(this,R.raw.p);
        final MediaPlayer ss21= MediaPlayer.create(this,R.raw.r);final MediaPlayer ss22= MediaPlayer.create(this,R.raw.s);
        final MediaPlayer ss23= MediaPlayer.create(this,R.raw.se);final MediaPlayer ss24= MediaPlayer.create(this,R.raw.t);
        final MediaPlayer ss25= MediaPlayer.create(this,R.raw.u);final MediaPlayer ss26= MediaPlayer.create(this,R.raw.uu);
        final MediaPlayer ss27= MediaPlayer.create(this,R.raw.v);final MediaPlayer ss28= MediaPlayer.create(this,R.raw.y);
        final MediaPlayer ss29= MediaPlayer.create(this,R.raw.z);

        btn10=(Button)findViewById(R.id.btn10);btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);btn13=(Button)findViewById(R.id.btn13);
        btn14=(Button)findViewById(R.id.btn14);btn15=(Button)findViewById(R.id.btn15);
        btn16=(Button)findViewById(R.id.btn16);btn17=(Button)findViewById(R.id.btn17);
        btn18=(Button)findViewById(R.id.btn18);btn19=(Button)findViewById(R.id.btn19);
        btn20=(Button)findViewById(R.id.btn20);btn21=(Button)findViewById(R.id.btn21);
        btn22=(Button)findViewById(R.id.btn22);btn23=(Button)findViewById(R.id.btn23);
        btn24=(Button)findViewById(R.id.btn24);btn25=(Button)findViewById(R.id.btn25);
        btn26=(Button)findViewById(R.id.btn26);btn27=(Button)findViewById(R.id.btn27);
        btn28=(Button)findViewById(R.id.btn28);btn29=(Button)findViewById(R.id.btn29);
        btn30=(Button)findViewById(R.id.btn30);btn31=(Button)findViewById(R.id.btn31);
        btn32=(Button)findViewById(R.id.btn32);btn33=(Button)findViewById(R.id.btn33);
        btn34=(Button)findViewById(R.id.btn34);btn35=(Button)findViewById(R.id.btn35);
        btn36=(Button)findViewById(R.id.btn36);btn37=(Button)findViewById(R.id.btn37);
        btn38=(Button)findViewById(R.id.btn38);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss1.start();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss2.start();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss3.start();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss4.start();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss5.start();
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss6.start();
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss7.start();
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss8.start();
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss9.start();
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss10.start();
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss11.start();
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss12.start();
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss13.start();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss14.start();
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss15.start();
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss16.start();
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss17.start();
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss18.start();
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss19.start();
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss20.start();
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss21.start();
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss22.start();
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss23.start();
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss24.start();
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss25.start();
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss26.start();
            }
        });
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss27.start();
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss28.start();
            }
        });
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss29.start();
            }
        });


    }
}