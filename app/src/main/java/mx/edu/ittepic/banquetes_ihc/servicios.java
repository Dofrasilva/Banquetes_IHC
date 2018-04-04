package mx.edu.ittepic.banquetes_ihc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
    }
    public void taquizas(View v){
        Intent frida =new Intent(servicios.this,taquizas.class);
        startActivity(frida);
    }
    public void bodas(View v){
        Intent frida =new Intent(servicios.this,bodas.class);
        startActivity(frida);
    }
    public void dulces(View v){
        Intent frida =new Intent(servicios.this,dulces.class);
        startActivity(frida);
    }
}
