package com.senac.senacnapraca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CursosActivity extends AppCompatActivity {

    private ListView listaCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        listaCursos = findViewById(R.id.listaCursos);

    }

    @Override
    protected void onResume() {
        carregaCursos();
        super.onResume();
    }

    private void carregaCursos() {

        List<String> cursos = new ArrayList<>();
        cursos.add("ELABORAÇÃO DE LAUDOS PERICIAIS AMBIENTAIS");
        cursos.add("EXCEL 2016");
        cursos.add("OFICINA DE DJ");
        cursos.add("CONSULTORIA DE IMAGEM");
        cursos.add("APRENDIZAGEM PROFISSIONAL EM COMÉRCIO DE BENS, SERVIÇOS E TURISMO");
        cursos.add("RETENÇÃO DE IMPOSTOS E CONTRIBUIÇÕES");
        cursos.add("FOTOGRAFIA DE CASAMENTO");
        cursos.add("PROMOTOR DE VENDAS");
        cursos.add(" AUXILIAR DE ESCRITÓRIO");
        cursos.add("DESIGN DE SOBRANCELHAS COM RETIRADA DE PELOS COM PINÇA E CORREÇÃO COM HENA");
        cursos.add("RECRUTAMENTO E SELEÇÃO POR COMPETÊNCIA");
        cursos.add("ESTRATÉGIAS PARA ELABORAÇÃO DO PPRA");
        cursos.add("GESTÃO TRIBUTÁRIA - PLANEJAMENTO TRIBUTÁRIO");
        cursos.add("INTRODUÇÃO À ADMINISTRAÇÃO DE PEQUENAS E MÉDIAS EMPRESAS");
        cursos.add("ADMINISTRAÇÃO DE OPERAÇÕES LOGÍSTICAS");
        cursos.add("INCLUSÃO DE PESSOAS COM DEFICIÊNCIA: PLANEJAMENTO E PRÁTICA");
        cursos.add("AUTOCAD 2018 BÁSICO - PROJETOS EM 2D");
        cursos.add("FOTOGRAFIA COM CELULAR OU CÂMERA COMPACTA");
        cursos.add("TÉCNICAS DE NEGOCIAÇÃO");
        cursos.add("ESCRITURAÇÃO FISCAL");
        cursos.add("LÍNGUA BRASILEIRA DE SINAIS 1");


        //Para conseguirmos popular um componente da tela, que é um XML, precisamos criar um adaptador para isso
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cursos);

        //Coloca no componente da tela
        listaCursos.setAdapter(adapter);
    }
}
