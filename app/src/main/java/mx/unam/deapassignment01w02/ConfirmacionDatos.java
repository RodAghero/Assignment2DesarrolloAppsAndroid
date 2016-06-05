package mx.unam.deapassignment01w02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        //Para atrapar los strings con botonSiguiente
        Intent intent = getIntent();
        String atrapaNombre = intent.getStringExtra("recibeNombre");
        String atrapaTelefono = intent.getStringExtra("recibeTelefono");
        String atrapaEmail = intent.getStringExtra("recibeEmail");
        String atrapaDescripcion = intent.getStringExtra("recibeDescripcion");

        // Para mostrar los strings con botonSiguiente
        TextView recibeNombreTV = (TextView) findViewById(R.id.outputNombre);
        recibeNombreTV.setText(atrapaNombre);

        TextView recibeTelefonoTV = (TextView) findViewById(R.id.outputTelefono);
        recibeTelefonoTV.setText(atrapaTelefono);

        TextView recibeEmailTV = (TextView) findViewById(R.id.outputEmail);
        recibeEmailTV.setText(atrapaEmail);

        TextView recibeDescripcionTV = (TextView) findViewById(R.id.outputDescripcion);
        recibeDescripcionTV.setText(atrapaDescripcion);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Inicia botonEditar
        Button botonEditar = (Button) findViewById(R.id.botonEditar);

        botonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Para lanzar los strings con botonEditar
                TextView recibeNombreET2 = (TextView) findViewById(R.id.outputNombre);
                String recibeNombreS2 = recibeNombreET2.getText().toString();

                TextView recibeTelefonoET2 = (TextView) findViewById(R.id.outputTelefono);
                String recibeTelefonoS2 = recibeTelefonoET2.getText().toString();

                TextView recibeEmailET2 = (TextView) findViewById(R.id.outputEmail);
                String recibeEmailS2 = recibeEmailET2.getText().toString();

                TextView recibeDescripcionET2 = (TextView) findViewById(R.id.outputDescripcion);
                String recibeDescripcionS2 = recibeDescripcionET2.getText().toString();

                // Comienza intent botonEditar
                Intent intent = new Intent(ConfirmacionDatos.this, MainActivity.class);
                intent.putExtra("recibeNombre2", recibeNombreS2);
                intent.putExtra("recibeTelefono2", recibeTelefonoS2);
                intent.putExtra("recibeEmail2", recibeEmailS2);
                intent.putExtra("recibeDescripcion2", recibeDescripcionS2);

                // FinalIntent botonEditar
                startActivity(intent);
            }
        });
    }
}
