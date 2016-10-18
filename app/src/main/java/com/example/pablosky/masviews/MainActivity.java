package com.example.pablosky.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText entrada = (EditText) findViewById(R.id.entrada);
    private TextView salida = (EditText) findViewById(R.id.salida);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sePulsa(View v){
        salida.setText(String.valueOf(
                Float.parseFloat(entrada.getText().toString())*2.0));
    }


    public void sePulsa0(View v){
        entrada.setText(entrada.getText()+(String)v.getTag());
    }

}
