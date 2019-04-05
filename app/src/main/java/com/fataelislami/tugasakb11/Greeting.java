package com.fataelislami.tugasakb11;
//NAMA : FATA EL ISLAMI
//NIM  : 10116499
//KELAS : AKB11/IF-11

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Greeting extends AppCompatActivity {
    @BindView(R.id.txtGreeting)
    TextView txtGreeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        ButterKnife.bind(this);
        String nama;
        String umur;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                nama= null;
                umur=null;
            } else {
                nama= extras.getString("nama");
                umur=extras.getString("umur");
            }
        } else {
            nama= (String) savedInstanceState.getSerializable("nama");
            nama= (String) savedInstanceState.getSerializable("umur");

        }
        String greeting="Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP" +
                " mu tiap hari buat bantu kamu ngatur waktu:)";
        txtGreeting.setText(greeting);
    }

    @OnClick(R.id.btnOke)
    public void klik(){
        finish();
        System.exit(1);
    }
}
