package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class bilgi extends AppCompatActivity {

    Button b_answer1,b_answer2,b_answer3,b_answer4;
    ImageView iv_resim;
    List<Bilgi_item> list;
    Random r;
    int turn=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgi);

        r=new Random();
        iv_resim=(ImageView) findViewById(R.id.iv_resim);
        b_answer1=(Button) findViewById(R.id.b_answer1);
        b_answer2=(Button) findViewById(R.id.b_answer2);
        b_answer3=(Button) findViewById(R.id.b_answer3);
        b_answer4=(Button) findViewById(R.id.b_answer4);
        list=new ArrayList<>();
        for (int i=0; i< new Database().answers.length;i++){

            list.add(new Bilgi_item(new Database().answers[i],new Database().images[i]));
        }
        Collections.shuffle(list);
        newQuestion(turn);

        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (b_answer1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                  Toast.makeText(bilgi.this,"Doğru",Toast.LENGTH_SHORT).show();

                  if (turn <list.size()){
                      turn++;
                      newQuestion(turn);

                  }else {
                      Toast.makeText(bilgi.this,"Oyunu Bitirdin",Toast.LENGTH_SHORT).show();
                      finish();
                      Intent intentt=new Intent(bilgi.this,MainActivity.class);
                      startActivity(intentt);
                  }
              }else {
                  Toast.makeText(bilgi.this,"Yanlış",Toast.LENGTH_SHORT).show();
                  Toast.makeText(bilgi.this,"Oyunu kaybettin",Toast.LENGTH_SHORT).show();
                  finish();
                  Intent intentt=new Intent(bilgi.this,MainActivity.class);
                  startActivity(intentt);
              }
            }
        });
        b_answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(bilgi.this,"Doğru",Toast.LENGTH_SHORT).show();
                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(bilgi.this,"Oyunu Bitirdin",Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intentt=new Intent(bilgi.this,MainActivity.class);
                        startActivity(intentt);
                    }
                }else {
                    Toast.makeText(bilgi.this,"Yanlış",Toast.LENGTH_SHORT).show();
                    Toast.makeText(bilgi.this,"Oyunu kaybettin",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intentt=new Intent(bilgi.this,MainActivity.class);
                    startActivity(intentt);
                }
            }
        });
        b_answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(bilgi.this,"Doğru",Toast.LENGTH_SHORT).show();

                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);

                    }else {
                        Toast.makeText(bilgi.this,"Oyunu Bitirdin",Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intentt=new Intent(bilgi.this,MainActivity.class);
                        startActivity(intentt);
                    }
                }else {
                    Toast.makeText(bilgi.this,"Yanlış",Toast.LENGTH_SHORT).show();
                    Toast.makeText(bilgi.this,"Oyunu kaybettin",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intentt=new Intent(bilgi.this,MainActivity.class);
                    startActivity(intentt);
                }

            }
        });
        b_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_answer4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(bilgi.this,"Doğru",Toast.LENGTH_SHORT).show();
                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(bilgi.this,"Oyunu Bitirdin",Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intentt=new Intent(bilgi.this,MainActivity.class);
                        startActivity(intentt);
                    }
                }else {
                    Toast.makeText(bilgi.this,"Yanlış",Toast.LENGTH_SHORT).show();
                    Toast.makeText(bilgi.this,"Oyunu kaybettin",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intentt=new Intent(bilgi.this,MainActivity.class);
                    startActivity(intentt);
                }
            }
        });
    }


    private void newQuestion(int number){

        iv_resim.setImageResource(list.get(number-1).getImage());
        int correct_answer=r.nextInt(4)+1;
        int firstButton=number-1;
        int secondButton;
        int thirdButton;
        int forthButton;

        switch (correct_answer){
            case 1:
                b_answer1.setText(list.get(firstButton).getName());
                do {
                    secondButton=r.nextInt(list.size());
                }while (secondButton==firstButton);
                do {
                    thirdButton=r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton==secondButton);
                do {
                    forthButton=r.nextInt(list.size());
                }while (forthButton==firstButton ||forthButton==secondButton ||forthButton==thirdButton);

                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(forthButton).getName());

                break;
            case 2:
                b_answer2.setText(list.get(firstButton).getName());
                do {
                    secondButton=r.nextInt(list.size());
                }while (secondButton==firstButton);
                do {
                    thirdButton=r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton==secondButton);
                do {
                    forthButton=r.nextInt(list.size());
                }while (forthButton==firstButton ||forthButton==secondButton ||forthButton==thirdButton);

                b_answer1.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(forthButton).getName());
                break;
            case 3:
                b_answer3.setText(list.get(firstButton).getName());
                do {
                    secondButton=r.nextInt(list.size());
                }while (secondButton==firstButton);
                do {
                    thirdButton=r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton==secondButton);
                do {
                    forthButton=r.nextInt(list.size());
                }while (forthButton==firstButton ||forthButton==secondButton ||forthButton==thirdButton);
                b_answer2.setText(list.get(secondButton).getName());
                b_answer1.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(forthButton).getName());
                break;
            case 4:
                b_answer4.setText(list.get(firstButton).getName());
                do {
                    secondButton=r.nextInt(list.size());
                }while (secondButton==firstButton);
                do {
                    thirdButton=r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton==secondButton);
                do {
                    forthButton=r.nextInt(list.size());
                }while (forthButton==firstButton ||forthButton==secondButton ||forthButton==thirdButton);
                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer1.setText(list.get(forthButton).getName());
                break;
        }
    }
}
