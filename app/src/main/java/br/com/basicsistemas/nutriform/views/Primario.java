package br.com.basicsistemas.nutriform.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.basicsistemas.nutriform.JanelasDasViews;
import br.com.basicsistemas.nutriform.R;


public class Primario extends JanelasDasViews {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView(R.layout.nav_drawer_primario);


        TextView nome_toolbar = findViewById( R.id.nome_primario_toolbar );
        nome_toolbar.setText(R.string.nome_primario);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Botão clicado", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                //Toast.makeText( Primario.this, "Projeto no Toast", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent( Primario.this, Secundario.class);
                startActivity(intent);


            }
        });


    }


}
