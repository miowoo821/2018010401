package com.example.student.a2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView tv=new TextView(this);
        tv.setText("XXXXX");
        Button btn=new Button(this);
        btn.setText("CLICK");
        Button btn2=new Button(this);
        btn.setText("CLICK");
        Button btn3=new Button(this);
        btn.setText("CLICK");
        Button btn4=new Button(this);
        btn.setText("CLICK");
        Button btn5=new Button(this);
        btn.setText("CLICK");
        Button btn6=new Button(this);
        btn.setText("CLICK");
        Button btn7=new Button(this);
        btn.setText("CLICK");
        Button btn8=new Button(this);
        btn.setText("CLICK");
        Button btn9=new Button(this);
        btn.setText("CLICK");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"點我",Toast.LENGTH_SHORT).show();
            }
        });
        LinearLayout layout1=new LinearLayout(this);
        LinearLayout layout2=new LinearLayout(this);
        LinearLayout layout3=new LinearLayout(this);
        LinearLayout layoutall=new LinearLayout(this);

        //setContentView(btn);
        layout1.addView(btn);
        layout1.addView(btn2);
        layout1.addView(btn3);
        layout2.addView(btn4);
        layout2.addView(btn5);
        layout2.addView(btn6);
        layout3.addView(btn7);
        layout3.addView(btn8);
        layout3.addView(btn9);
        layoutall.setOrientation(LinearLayout.VERTICAL);
        layoutall.addView(layout1);
        layoutall.addView(layout2);
        layoutall.addView(layout3);
        setContentView(layoutall);





    }
}
