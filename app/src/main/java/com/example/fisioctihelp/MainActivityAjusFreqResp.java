package com.example.fisioctihelp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fisioctihelp.databinding.ActivityMainAjusFreqRespBinding;

public class MainActivityAjusFreqResp extends AppCompatActivity {

    EditText editTextfatual, editTextPaCO2Atual, editTextPaCO2Alvo;
    TextView textViewResultado;

    //private AppBarConfiguration appBarConfiguration;
    private ActivityMainAjusFreqRespBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainAjusFreqRespBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        editTextfatual = findViewById(R.id.editTextfatual);
        editTextPaCO2Atual = findViewById(R.id.editTextPaCO2Atual);
        editTextPaCO2Alvo = findViewById(R.id.editTextPaCO2Alvo);

        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void buttonCalcFreqResp (View view) {
        double fatual = Double.parseDouble(editTextfatual.getText().toString());
        double paco2atual = Double.parseDouble(editTextPaCO2Atual.getText().toString());
        double paco2alvo = Double.parseDouble(editTextPaCO2Alvo.getText().toString());
        double resultado = fatual * paco2atual / paco2alvo;
        textViewResultado.setText("Resultado:" + resultado);
    }
}

        //setSupportActionBar(binding.toolbar);

       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_activity_ajus_freq_resp);
      //  appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
      //  NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

       // binding.fab.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
       //         Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
       //                 .setAction("Action", null).show();

      //  });
   // }

   // @Override
  //  public boolean onSupportNavigateUp() {
    //    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_container);
     //   return NavigationUI.navigateUp(navController, appBarConfiguration)
     //           || super.onSupportNavigateUp();
   // }
