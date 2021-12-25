package com.example.fisioctihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityAjusFIO2 extends AppCompatActivity {

    EditText editTextPaO2alvo, editTextFIO2atual, editTextPaO2atual;
    TextView textViewResultadoAjusFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ajus_fio2);

        editTextPaO2alvo =  findViewById(R.id.editTextPaO2alvo);
        editTextFIO2atual = findViewById(R.id.editTextFIO2atual);
        editTextPaO2atual = findViewById(R.id.editTextPaO2atual);

        textViewResultadoAjusFI = findViewById(R.id.textViewResultadoAjusFI);
    }

    public void buttonCalcularAjusFIO2 (View view) {
        double PaO2alvo = Double.parseDouble(editTextPaO2alvo.getText().toString());
        double FIO2atual = Double.parseDouble(editTextFIO2atual.getText().toString());
        double PaO2atual = Double.parseDouble(editTextPaO2atual.getText().toString());
        double resultado = PaO2alvo * FIO2atual / PaO2atual;
        textViewResultadoAjusFI.setText("Resultado:" + resultado);
    }
}