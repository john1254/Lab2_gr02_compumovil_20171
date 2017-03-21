package com.example.john.laboratorio2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    private Button botonConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DataBaseHelper helper=new DataBaseHelper(this);
        SQLiteDatabase db=helper.getWritableDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        botonConfirmar=(Button)findViewById(R.id.botonRegistro);
        botonConfirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
