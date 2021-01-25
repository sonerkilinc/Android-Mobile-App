package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
public class piyano extends AppCompatActivity {
    View d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12;
    private MediaPlayer mD1,mD2,mD3,mD4,mD5,mD6,mD7,mD8,mD9,mD10,mD11,mD12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piyano);

        mD1=MediaPlayer.create(this,R.raw.kalindo);mD2=MediaPlayer.create(this,R.raw.kalinre);
        mD3=MediaPlayer.create(this,R.raw.kalinmi);mD4=MediaPlayer.create(this,R.raw.kalinfa);
        mD5=MediaPlayer.create(this,R.raw.kalinsol);mD6=MediaPlayer.create(this,R.raw.kalinla);
        mD7=MediaPlayer.create(this,R.raw.si);mD8=MediaPlayer.create(this,R.raw.inced);
        mD9=MediaPlayer.create(this,R.raw.re);mD10=MediaPlayer.create(this,R.raw.mi);
        mD11=MediaPlayer.create(this,R.raw.incefa);mD12=MediaPlayer.create(this,R.raw.sol);

        d1=findViewById(R.id.d1);d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);d8=findViewById(R.id.d8);
        d9=findViewById(R.id.d9);d10=findViewById(R.id.d10);
        d11=findViewById(R.id.d11);d12=findViewById(R.id.d12);

        d1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD1.start();
                d1.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d1.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

        d2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD2.start();
                d2.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d2.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD3.start();
                d3.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d3.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD4.start();
                d4.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d4.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD5.start();
                d5.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d5.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD6.start();
                d6.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d6.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD7.start();
                d7.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d7.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD8.start();
                d8.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d8.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD9.start();
                d9.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d9.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d10.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD10.start();
                d10.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d10.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d11.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD11.start();
                d11.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d11.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d12.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD12.start();
                d12.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d12.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

    }
}