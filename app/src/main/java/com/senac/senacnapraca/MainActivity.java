package com.senac.senacnapraca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera o botão novo aluno para abrir a tela de cadastro
        Button cursosSenac = findViewById(R.id.cursosSenac);

        cursosSenac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contato = new Intent(MainActivity.this, CursosActivity.class);
                startActivity(contato);
            }
        });

    }
}
