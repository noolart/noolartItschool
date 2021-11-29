package com.example.quadraticequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText a_view,b_view,c_view,sign1,sign2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.txt);
        a_view=findViewById(R.id.a);
        b_view=findViewById(R.id.b);
        c_view=findViewById(R.id.c);
        sign1=findViewById(R.id.sign1);
        sign2=findViewById(R.id.sign2);
    }

    public void useSettings(View view){
        double a = Double.parseDouble(a_view.getText().toString());
        double b = Double.parseDouble(b_view.getText().toString());
        double c = Double.parseDouble(c_view.getText().toString());
        if(sign1.getText().toString().equals("-")){
            b*=(-1);
        }
        if(sign2.getText().toString().equals("-")){
            c*=(-1);
        }
        double d = b*b-4*a*c;
        if(d>=0){
            txt.setText("x1="+ ((b*(-1)+Math.sqrt(d))/(2*a))+";"+ " x2="+((b*(-1)-Math.sqrt(d))/(2*a)));
        }
        else{
            txt.setText("no roots");
        }
    }
}