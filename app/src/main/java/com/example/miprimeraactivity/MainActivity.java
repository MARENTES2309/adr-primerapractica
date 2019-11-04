package com.example.miprimeraactivity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Person;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button b = findViewById(R.id.porcentaje);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        }); */

        Bundle bb=getIntent().getExtras();

        persona p =(persona) bb.getSerializable("Persona");
        Toast.makeText(this,p.getNombre()+" "+p.getEdad()+" "+p.esmayor(), Toast.LENGTH_SHORT).show();
    }

    String texto = "";
    String operador;
    Double total;
    Double n1 = 0.0;
    Double n2 = 0.0;
    String numero;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void miclick(View view) {

        TextView vistaTexto = findViewById(R.id.resultados);

        switch (view.getId()) {
             case R.id.llamar:
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:555-555-555"));
                if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(intent);
                break;
            case R.id.Cero:
                vistaTexto.setText(vistaTexto.getText() + "0");
                break;
            case R.id.Uno:
                vistaTexto.setText(vistaTexto.getText() + "1");
                break;
            case R.id.Dos:
                vistaTexto.setText(vistaTexto.getText() + "2");
                break;
            case R.id.Tres:
                vistaTexto.setText(vistaTexto.getText() + "3");
                break;
            case R.id.Cuatro:
                vistaTexto.setText(vistaTexto.getText() + "4");
                break;
            case R.id.Cinco:
                vistaTexto.setText(vistaTexto.getText() + "5");
                break;
            case R.id.Seis:
                vistaTexto.setText(vistaTexto.getText() + "6");
                break;
            case R.id.Siete:
                vistaTexto.setText(vistaTexto.getText() + "7");
                break;
            case R.id.Ocho:
                vistaTexto.setText(vistaTexto.getText() + "8");
                break;
            case R.id.Nueve:
                vistaTexto.setText(vistaTexto.getText() + "9");
                break;
        }
        switch (view.getId()){
            case R.id.Divide:
                n1= Double.parseDouble(vistaTexto.getText().toString());
                operador="÷";
                vistaTexto.setText("");
                break;
            case R.id.porcentaje:
                n1= Double.parseDouble(vistaTexto.getText().toString());
                operador="%";
                vistaTexto.setText("");
                break;
            case R.id.Multiplica:
                n1= Double.parseDouble(vistaTexto.getText().toString());
                operador="*";
                vistaTexto.setText("");
                break;
            case R.id.Resta:
                n1= Double.parseDouble(vistaTexto.getText().toString());
                operador="-";
                vistaTexto.setText("");
                break;
            case R.id.Suma:
                n1= Double.parseDouble(vistaTexto.getText().toString());
                operador="+";
                vistaTexto.setText("");
                break;
            case R.id.Igual:
                switch(operador){
                    case "/":
                        n2 = Double.parseDouble(vistaTexto.getText().toString());
                        total = n1 /n2;
                        vistaTexto.setText(String.valueOf(total));
                        break;
                    case "+":
                        n2 = Double.parseDouble(vistaTexto.getText().toString());
                        total = n1+n2;
                        vistaTexto.setText(String.valueOf(total));
                        break;
                    case "-":
                        n2 = Double.parseDouble(vistaTexto.getText().toString());
                        total = n1-n2;
                        vistaTexto.setText(String.valueOf(total));
                        break;
                    case "*":
                        n2 = Double.parseDouble(vistaTexto.getText().toString());
                        total = n1*n2;
                        vistaTexto.setText(String.valueOf(total));
                        break;

                }
                break;
            case R.id.Clean:
                n1= 0.0;
                n2= 0.0;
                operador = "";
                vistaTexto.setText("");
                break;
        }

    }

    @Override
    public void onClick(View view) {
        
    }
}



