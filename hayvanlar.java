package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class hayvanlar extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16;
    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar);

        final MediaPlayer ses1=MediaPlayer.create(this,R.raw.agackakan);final MediaPlayer ses2=MediaPlayer.create(this,R.raw.agustos);
        final MediaPlayer ses3=MediaPlayer.create(this,R.raw.ari);final MediaPlayer ses4=MediaPlayer.create(this,R.raw.aslan);
        final MediaPlayer ses5=MediaPlayer.create(this,R.raw.at);final MediaPlayer ses6=MediaPlayer.create(this,R.raw.ceylan);
        final MediaPlayer ses7=MediaPlayer.create(this,R.raw.fil);final MediaPlayer ses8=MediaPlayer.create(this,R.raw.hindi);
        final MediaPlayer ses9=MediaPlayer.create(this,R.raw.horoz);final MediaPlayer ses10=MediaPlayer.create(this,R.raw.kanarya);
        final MediaPlayer ses11=MediaPlayer.create(this,R.raw.kaz);final MediaPlayer ses12=MediaPlayer.create(this,R.raw.kedi);
        final MediaPlayer ses13=MediaPlayer.create(this,R.raw.kopek);final MediaPlayer ses14=MediaPlayer.create(this,R.raw.koyun);
        final MediaPlayer ses15=MediaPlayer.create(this,R.raw.sincap);final MediaPlayer ses16=MediaPlayer.create(this,R.raw.ordek);

        bt1=(Button)findViewById(R.id.bt1);bt2=(Button)findViewById(R.id.bt2);bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);bt5=(Button)findViewById(R.id.bt5);bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);bt8=(Button)findViewById(R.id.bt8);bt9=(Button)findViewById(R.id.bt9);
        bt10=(Button)findViewById(R.id.bt10);bt11=(Button)findViewById(R.id.bt11);bt12=(Button)findViewById(R.id.bt12);
        bt13=(Button)findViewById(R.id.bt13);bt14=(Button)findViewById(R.id.bt14);bt15=(Button)findViewById(R.id.bt15);
        bt16=(Button)findViewById(R.id.bt16);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.start();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.start();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.start();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.start();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.start();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.start();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.start();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.start();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.start();
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.start();
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.start();
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.start();
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.start();
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.start();
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.start();
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.start();
            }
        });

        but1=(Button)findViewById(R.id.but1);but2=(Button)findViewById(R.id.but2);
        but3=(Button)findViewById(R.id.but3);but4=(Button)findViewById(R.id.but4);
        but5=(Button)findViewById(R.id.but5);but6=(Button)findViewById(R.id.but6);
        but7=(Button)findViewById(R.id.but7);but8=(Button)findViewById(R.id.but8);
        but9=(Button)findViewById(R.id.but9);but10=(Button)findViewById(R.id.but10);
        but11=(Button)findViewById(R.id.but11);but12=(Button)findViewById(R.id.but12);
        but13=(Button)findViewById(R.id.but13);but14=(Button)findViewById(R.id.but14);
        but15=(Button)findViewById(R.id.but15);but16=(Button)findViewById(R.id.but16);

        final MediaPlayer see1=MediaPlayer.create(this,R.raw.agackakann);
        final MediaPlayer see2=MediaPlayer.create(this,R.raw.agustosn);
        final MediaPlayer see3=MediaPlayer.create(this,R.raw.arin);
        final MediaPlayer see4=MediaPlayer.create(this,R.raw.aslann);
        final MediaPlayer see5=MediaPlayer.create(this,R.raw.atn);
        final MediaPlayer see6=MediaPlayer.create(this,R.raw.ceylann);
        final MediaPlayer see7=MediaPlayer.create(this,R.raw.filn);
        final MediaPlayer see8=MediaPlayer.create(this,R.raw.hindin);
        final MediaPlayer see9=MediaPlayer.create(this,R.raw.horozn);
        final MediaPlayer see10=MediaPlayer.create(this,R.raw.kanaryan);
        final MediaPlayer see11=MediaPlayer.create(this,R.raw.kazn);
        final MediaPlayer see12=MediaPlayer.create(this,R.raw.kedin);
        final MediaPlayer see13=MediaPlayer.create(this,R.raw.kuzu);
        final MediaPlayer see14=MediaPlayer.create(this,R.raw.kopekn);
        final MediaPlayer see15=MediaPlayer.create(this,R.raw.ordekn);
        final MediaPlayer see16=MediaPlayer.create(this,R.raw.sincapn);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see1.start();
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see2.start();
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see3.start();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see4.start();
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see5.start();
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see6.start();
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see7.start();
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see8.start();
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see9.start();
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see10.start();
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see11.start();
            }
        });
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see12.start();
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see13.start();
            }
        });
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see14.start();
            }
        });
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see15.start();
            }
        });
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                see16.start();
            }
        });


    }
}