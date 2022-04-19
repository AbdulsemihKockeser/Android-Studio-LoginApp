package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String eposta="kockesers@gmail.com";
    final String şifre="123456789";

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.edtusername);
        password= findViewById(R.id.edtpassword);
        Button login= findViewById(R.id.btnlogin);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      login();
                    }
                });
    }

    void login(){

            if (!eposta.equals(username.getText().toString()))
                System.out.println("E-Postanızı lütefen Doğru Giriniz");
            else if(!şifre.equals(password.getText().toString()))
                System.out.println("Şifrenizi Lütfen kontrol ediniz");
            else
                System.out.println("Login İşlemi Başaralıdır");
        }
}