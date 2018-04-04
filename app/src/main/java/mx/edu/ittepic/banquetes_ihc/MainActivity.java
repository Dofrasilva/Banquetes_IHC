package mx.edu.ittepic.banquetes_ihc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acerca (View v){
        AlertDialog.Builder mensaje = new AlertDialog.Builder(MainActivity.this);
        mensaje.setTitle("Equipo: ").
                setMessage("* Materia: IHC \n* Maestro:    Maximino González   González \n" +
                        "* Alumnos: \n"+"    Alejandra Aquino \n    Arley Aquino\n    Ulises Silva \n").
                setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        mensaje.show();
    }
    public void platillos(View v){
        Intent frida =new Intent(MainActivity.this,platillos.class);
        startActivity(frida);
    }
    public void servicios(View v){
        Intent frida =new Intent(MainActivity.this,servicios.class);
        startActivity(frida);
    }
    public void contacto(View v){
        Intent frida =new Intent(MainActivity.this,contacto.class);
        startActivity(frida);
    }

}
