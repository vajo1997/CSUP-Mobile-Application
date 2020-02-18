package com.example.zakazivanjetermina;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zakazivanje extends AppCompatActivity {
    String username = "";
    String datum = "";
    String vrijeme = "";
    String cijena = "";
    String sport = "";

    private EditText sportEdit, datumEdit, vrijemeEdit, usernameEdit, cijenaEdit;
    EditText broj;
    private Button dugme, poruka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakazivanje);


        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            username = (String) b.get("UserName");
            datum = (String) b.get("Datum");
            vrijeme = (String) b.get("Vrijeme");
            cijena = (String) b.get("Cijena");
            sport = (String) b.get("Sport");

        }


        dugme = findViewById(R.id.dugme);
        poruka = findViewById(R.id.poruka);
        broj = findViewById(R.id.brojSms);


        sportEdit = findViewById(R.id.sport);
        datumEdit = findViewById(R.id.datum);
        vrijemeEdit = findViewById(R.id.vrijeme);
        cijenaEdit = findViewById(R.id.cijena);
        usernameEdit = findViewById(R.id.username);


        usernameEdit.setText(username);
        sportEdit.setText(sport);
        datumEdit.setText(datum);
        vrijemeEdit.setText(vrijeme);
        cijenaEdit.setText(cijena);


        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String poruka = "Uspješno ste zakazali termin. Username: " + usernameEdit.getText().toString() + "\n Datum: " + datumEdit.getText().toString() + "\n Vrijeme " + vrijemeEdit.getText().toString() + "\n Cijena " + cijenaEdit.getText().toString();
                Toast.makeText(zakazivanje.this, poruka, Toast.LENGTH_LONG).show();

            }
        });

        poruka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(zakazivanje.this, "Poslali ste poruku", Toast.LENGTH_LONG).show();

                SmsManager smsManager = SmsManager.getDefault();
                String Smsporuka = "Uspješno ste zakazali termin.";
                String sms = "+38268835943";
                smsManager.sendTextMessage(sms, null, Smsporuka, null, null);

            }

        });
    }

}




