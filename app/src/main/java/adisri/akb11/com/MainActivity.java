package adisri.akb11.com;
/*
 * tanggal : 17 april 2019
 * 10116503
 * Adisri Yustitia Arofa
 * AKB-11/IF-11
 *
 *
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk = (TextView) findViewById(R.id.btn_daftar);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk =new Intent(getApplicationContext(),daftar_activity.class);
                startActivity(masuk);
            }
        });
    }


}
