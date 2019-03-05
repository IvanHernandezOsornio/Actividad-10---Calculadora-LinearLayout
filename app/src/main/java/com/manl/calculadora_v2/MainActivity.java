package com.manl.calculadora_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.manl.calculadora_ii.R;

public class MainActivity extends AppCompatActivity {
    private float numero1;
    private float numero2;
    private float resultado;
    private EditText valor_1,valor_2,resultado_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor_1 = findViewById(R.id.et_numero1);
        valor_2 = findViewById(R.id.et_numero2);
        resultado_ = findViewById(R.id.et_resultado);
    }
    public void Sumar(View view){
        numero1 = Float.parseFloat(valor_1.getText().toString());
        numero2 = Float.parseFloat(valor_2.getText().toString());
        resultado = numero1 + numero2;
        resultado_.setText(String.valueOf(resultado));
    }
    public void Restar(View view){
        numero1 = Float.parseFloat(valor_1.getText().toString());
        numero2 = Float.parseFloat(valor_2.getText().toString());
        resultado = numero1 - numero2;
        resultado_.setText(String.valueOf(resultado));
    }
    public void Multiplicar(View view){
        numero1 = Float.parseFloat(valor_1.getText().toString());
        numero2 = Float.parseFloat(valor_2.getText().toString());
        resultado = numero1 * numero2;
        resultado_.setText(String.valueOf(resultado));
    }
    public void Dividir(View view){
        numero1 = Float.parseFloat(valor_1.getText().toString());
        numero2 = Float.parseFloat(valor_2.getText().toString());
        resultado = numero1 / numero2;
        resultado_.setText(String.valueOf(resultado));
    }
    public void Modulo(View view){
        numero1 = Float.parseFloat(valor_1.getText().toString());
        numero2 = Float.parseFloat(valor_2.getText().toString());
        resultado = numero1 % numero2;
        resultado_.setText(String.valueOf(resultado));
    }
}
