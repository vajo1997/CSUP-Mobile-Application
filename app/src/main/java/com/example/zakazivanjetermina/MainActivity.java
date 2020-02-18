package com.example.zakazivanjetermina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button dugme;
    private EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dugme = findViewById(R.id.dugme);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);




        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NoviUser = username.getText().toString();
                String NoviPass = password.getText().toString();

                if(NoviUser.equals("vasilije97") && NoviPass.equals("12345678")){

                    Intent inte = new Intent(MainActivity.this,meni.class);
                    inte.putExtra("UserName",NoviUser);
                    startActivity(inte);

                }else{
                    Toast.makeText(MainActivity.this, "Nisu validne informacije", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}