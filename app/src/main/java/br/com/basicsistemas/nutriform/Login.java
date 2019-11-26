package br.com.basicsistemas.nutriform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {



    private Button btnlogin;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextInputLayout textLayoutEmail;
    private TextInputLayout textLayoutPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        editTextEmail = findViewById(R.id.et_email);
        textLayoutEmail = findViewById(R.id.txtlayout_email);

        editTextPassword =   findViewById(R.id.et_password);
        textLayoutPassword = findViewById(R.id.txtlayout_password);

        btnlogin = findViewById(R.id.id_btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateForm(view);
            }
        });

    }


    private void validateForm(View view ){


        if(editTextEmail.getText().toString().isEmpty()){

            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError("Preencha com seu email");
        }else{
            textLayoutEmail.setErrorEnabled(false);

        }

        if(editTextPassword.getText().toString().isEmpty()){

            textLayoutPassword.setErrorEnabled(true);
            textLayoutPassword.setError("Preencha com seu password");

        }else{
            textLayoutPassword.setErrorEnabled(false);

        }

        if(!(editTextEmail.getText().toString().isEmpty() || editTextPassword.getText().toString().isEmpty())){


            Intent intent = new Intent(Login.this, Principal.class);
            startActivity(intent);

            //Snackbar.make(view, "Textos Inseridos Com Sucesso", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
        }

    }
}
