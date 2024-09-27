package br.ulbra.trocadetelas;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    TextView txtFoto;
    ImageView imgFoto1;
    Button bt1Tela1, bt2Tela1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFoto1 = (ImageView) findViewById(R.id.imgFoto);
        txtFoto = findViewById(R.id.txtFoto);
        bt1Tela1 = (Button) findViewById(R.id.bt1Tela1);
        bt2Tela1= (Button) findViewById(R.id.bt2Tela1);

        bt1Tela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgFoto1.setImageResource(R.drawable.foto1);
                txtFoto.setText("Foto 1 - stitch  dando tchau");
            } });

        bt2Tela1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgFoto1.setImageResource(R.drawable.foto2);
                txtFoto.setText("Foto 2 - stitch Sorridente");
            } }); } }