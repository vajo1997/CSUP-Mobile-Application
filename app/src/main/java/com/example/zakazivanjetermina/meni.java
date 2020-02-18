package com.example.zakazivanjetermina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class meni extends AppCompatActivity {
    String username = "";
    private ImageView termin1,termin2,termin3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meni);


        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            username =(String) b.get("UserName");


        }

        termin1 = findViewById(R.id.termin1);
        termin2 = findViewById(R.id.termin2);
        termin3 = findViewById(R.id.termin3);


        termin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(meni.this,zakazivanje.class);
                inte.putExtra("UserName",username);
                inte.putExtra("Datum","20/12/2019");
                inte.putExtra("Vrijeme","12:00-13:00");
                inte.putExtra("Sport","Fudbal");
                inte.putExtra("Cijena","20.00");

                startActivity(inte);
            }
        });

        termin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(meni.this,zakazivanje.class);
                inte.putExtra("UserName",username);
                inte.putExtra("Datum","21/12/2019");
                inte.putExtra("Vrijeme","18:00-19:00");
                inte.putExtra("Sport","Fudbal");
                inte.putExtra("Cijena","25.00");

                startActivity(inte);
            }
        });


        termin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(meni.this,zakazivanje.class);
                inte.putExtra("UserName",username);
                inte.putExtra("Datum","22/12/2019");
                inte.putExtra("Vrijeme","20:00-21:00");
                inte.putExtra("Sport","Fudbal");
                inte.putExtra("Cijena","25.00");

                startActivity(inte);
            }
        });







    }
}