package mx.unam.deapassignment01w02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para atrapar los strings con botonEditar
        Intent intent = getIntent();
        String atrapaNombre = intent.getStringExtra("recibeNombre2");
        String atrapaTelefono = intent.getStringExtra("recibeTelefono2");
        String atrapaEmail = intent.getStringExtra("recibeEmail2");
        String atrapaDescripcion = intent.getStringExtra("recibeDescripcion2");

        // Para mostrar los strings con botonEditar
        EditText recibeNombreTV = (EditText) findViewById(R.id.inputNombre);
        recibeNombreTV.setText(atrapaNombre);

        EditText recibeTelefonoTV = (EditText) findViewById(R.id.inputTelefono);
        recibeTelefonoTV.setText(atrapaTelefono);

        EditText recibeEmailTV = (EditText) findViewById(R.id.inputEmail);
        recibeEmailTV.setText(atrapaEmail);

        EditText recibeDescripcionTV = (EditText) findViewById(R.id.inputDescripcion);
        recibeDescripcionTV.setText(atrapaDescripcion);



        ///////////////////////////////////////////////////////////////////////////////////////////
        // Inicia botonSiguiente
        Button botonSiguiente = (Button) findViewById(R.id.botonSiguiente);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Para lanzar los strings con botonSiguiente
                EditText recibeNombreET = (EditText) findViewById(R.id.inputNombre);
                String recibeNombreS = recibeNombreET.getText().toString();

                EditText recibeTelefonoET = (EditText) findViewById(R.id.inputTelefono);
                String recibeTelefonoS = recibeTelefonoET.getText().toString();

                EditText recibeEmailET = (EditText) findViewById(R.id.inputEmail);
                String recibeEmailS = recibeEmailET.getText().toString();

                EditText recibeDescripcionET = (EditText) findViewById(R.id.inputDescripcion);
                String recibeDescripcionS = recibeDescripcionET.getText().toString();

                //TextView textoNombreTV = (TextView) findViewById(R.id.outputNombre);
                //textoNombreTV.setText(textoNombreET.getText().toString());

                Intent intent = new Intent(MainActivity.this, ConfirmacionDatos.class);
                intent.putExtra("recibeNombre", recibeNombreS);
                intent.putExtra("recibeTelefono", recibeTelefonoS);
                intent.putExtra("recibeEmail", recibeEmailS);
                intent.putExtra("recibeDescripcion", recibeDescripcionS);

                // Final del intent
                startActivity(intent);
            }
        });


    }
}

