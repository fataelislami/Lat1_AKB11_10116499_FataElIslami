package com.fataelislami.tugasakb11;
//NAMA : FATA EL ISLAMI
//NIM  : 10116499
//KELAS : AKB11/IF-11
//TANGGAL : 5 APRIL 2019


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginCode extends AppCompatActivity {
    @BindView(R.id.btnMulai2)
    Button btnMulai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnMulai2)
    public void klik(){
        Intent i=new Intent(this,Biodata.class);
        startActivity(i);
    }
}
