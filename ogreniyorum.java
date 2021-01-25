package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ogreniyorum extends AppCompatActivity {
        private Button btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogreniyorum);

        btn6=(Button)findViewById(R.id.btn6);btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);btn9=(Button)findViewById(R.id.btn9);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ogreniyorum.this,harfler.class);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(ogreniyorum.this,sayilar.class);
                startActivity(inte);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ogreniyorum.this,bitkiler.class);
                startActivity(intent1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hyv=new Intent(ogreniyorum.this,hayvanlar.class);
                startActivity(hyv);
            }
        });
    }
}

