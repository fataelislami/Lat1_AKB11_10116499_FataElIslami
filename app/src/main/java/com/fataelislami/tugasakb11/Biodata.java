package com.fataelislami.tugasakb11;
//NAMA : FATA EL ISLAMI
//NIM  : 10116499
//KELAS : AKB11/IF-11

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Biodata extends AppCompatActivity {
    private String nama,umur;
    @BindView(R.id.edtNama)
    EditText edtNama;
    @BindView(R.id.edtUmur) EditText edtUmur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSelanjutnya)
    public void klik(){
        nama=edtNama.getText().toString();
        umur=edtUmur.getText().toString();
        Intent i=new Intent(this,Greeting.class);
        i.putExtra("nama", nama);
        i.putExtra("umur",umur);
        startActivity(i);

    }
}
